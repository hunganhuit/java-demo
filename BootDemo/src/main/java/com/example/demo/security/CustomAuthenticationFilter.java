///**
// * Copyright 2018 onwards - Sunit Katkar (sunitkatkar@gmail.com)
// *
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
// * in compliance with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software distributed under the License
// * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
// * or implied. See the License for the specific language governing permissions and limitations under
// * the License.
// */
//package com.example.demo.security;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.security.authentication.AuthenticationServiceException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.example.demo.common.TenantContextHolder;
//
//
//public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
//    public static final String SPRING_SECURITY_FORM_TENANT_NAME_KEY = "tenantId";
//
//    /*
//     * (non-Javadoc)
//     * 
//     * @see org.springframework.security.web.authentication.
//     * UsernamePasswordAuthenticationFilter#attemptAuthentication(javax.servlet.http
//     * .HttpServletRequest, javax.servlet.http.HttpServletResponse)
//     */
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        if (!request.getMethod().equals("POST")) {
//            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
//        }
//
//        UsernamePasswordAuthenticationToken authRequest = getAuthRequest(request);
//
//        System.out.println("attemptAuthentication");
//        setDetails(request, authRequest);
//
//        return this.getAuthenticationManager().authenticate(authRequest);
//    }
//
//    /**
//     * @param request
//     * @return
//     * @throws IOException
//     */
//    private UsernamePasswordAuthenticationToken getAuthRequest(HttpServletRequest request) {
//        String username = obtainUsername(request);
//        String password = obtainPassword(request);
//        String tenant = obtainTenant(request);
//        // put in tenant context threadlocal
//        TenantContextHolder.setTenantId(tenant);
//        ///
//        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(60);
//
//        if (username == null) {
//            username = "";
//        }
//        if (password == null) {
//            password = "";
//        }
//
//
//        System.out.println("Username: " + username + password);
//
//        return new UsernamePasswordAuthenticationToken(username, password);
//    }
//
//    /**
//     * @param request
//     * @return
//     */
//    private String obtainTenant(HttpServletRequest request) {
//        // return request.getReader().getClass();
//        return request.getParameter(SPRING_SECURITY_FORM_TENANT_NAME_KEY);
//    }
//
//}
