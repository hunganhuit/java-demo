package tma.ntt.demo.controller;


import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tma.ntt.demo.auth.AuthHelper;
import tma.ntt.demo.auth.IdToken;
import tma.ntt.demo.auth.TokenResponse;
import tma.ntt.demo.entity.OutlookUser;
import tma.ntt.demo.service.OutlookService;
import tma.ntt.demo.service.OutlookServiceBuilder;

@Controller
public class AuthorizeController {

    @RequestMapping(value = "/authorize", method = RequestMethod.POST)
    public String authorize(@RequestParam("code") String code, @RequestParam("id_token") String idToken, @RequestParam("state") UUID state,
            HttpServletRequest request) {
        {

            System.out.println("-- Request URL :" + request.getRequestURL().toString());
            System.out.println("-- Code :" + request.getParameter("code"));
            System.out.println("-- idToken :" + request.getParameter("id_token"));
            // Get the expected state value from the session
            HttpSession session = request.getSession();
            UUID expectedState = (UUID) session.getAttribute("expected_state");
            UUID expectedNonce = (UUID) session.getAttribute("expected_nonce");

            // Make sure that the state query parameter returned matches
            // the expected state
            if (state.equals(expectedState)) {
                // session.setAttribute("authCode", code);
                // session.setAttribute("idToken", idToken);
                IdToken idTokenObj = IdToken.parseEncodedToken(idToken, expectedNonce.toString());
                if (idTokenObj != null) {
                    TokenResponse tokenResponse = AuthHelper.getTokenFromAuthCode(code, idTokenObj.getTenantId());
                    session.setAttribute("tokens", tokenResponse);
                    session.setAttribute("userConnected", true);
                    session.setAttribute("userName", idTokenObj.getName());
                    // Get user info
                    OutlookService outlookService = OutlookServiceBuilder.getOutlookService(tokenResponse.getAccessToken(), null);
                    OutlookUser user;
                    try {
                        user = outlookService.getCurrentUser().execute().body();
                        session.setAttribute("userEmail", user.getMail());
                    } catch (IOException e) {
                        session.setAttribute("error", e.getMessage());
                    }
                    session.setAttribute("userTenantId", idTokenObj.getTenantId());
                } else {
                    session.setAttribute("error", "ID token failed validation.");
                }
            } else {
                session.setAttribute("error", "Unexpected state returned from authority.");
            }
            return "index";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/index.html";
    }
}
