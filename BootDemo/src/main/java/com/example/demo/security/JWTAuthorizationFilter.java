///*
// * Copyright (c) 2018 NTT TechnoCross Corporation
// */
//package com.example.demo.security;
//
//import java.io.IOException;
//import java.util.Arrays;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jws;
//import io.jsonwebtoken.Jwts;
//import jp.co.ntttx.voicecomcloud.SpringApplicationContext;
//import jp.co.ntttx.voicecomcloud.common.AppUtils;
//import jp.co.ntttx.voicecomcloud.common.Constant;
//
///**
// * The Class JWTAuthorizationFilter.
// */
//public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
//
//    public JWTAuthorizationFilter(AuthenticationManager authManager) {
//        super(authManager);
//    }
//
//    /*
//     * (non-Javadoc)
//     * 
//     * @see org.springframework.security.web.authentication.www.BasicAuthenticationFilter#
//     * doFilterInternal(javax.servlet.http.HttpServletRequest,
//     * javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
//     */
//    @Override
//    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        String header = req.getHeader(Constant.SECURITY.HEADER_STRING);
//
//        if (header == null || !header.startsWith(Constant.SECURITY.TOKEN_PREFIX)) {
//            chain.doFilter(req, res);
//            return;
//        }
//
//        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
//        // Set authentication
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        chain.doFilter(req, res);
//    }
//
//    /**
//     * Gets the authentication.
//     *
//     * @param request : the HttpServletRequest
//     * @return : the authentication
//     */
//    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
//        try {
//            String token = request.getHeader(Constant.SECURITY.HEADER_STRING);
//            if (token != null) {
//                // Validate JWT
//                Jws<Claims> claims = Jwts.parser().setSigningKey(SpringApplicationContext.getConfig().getJwtSecret().getBytes())
//                        .parseClaimsJws(token.replace(Constant.SECURITY.TOKEN_PREFIX, ""));
//                String username = (String) claims.getBody().get("username");
//                String role = (String) claims.getBody().get("role");
//                String tenantId = (String) claims.getBody().get("tenantId");
//                AppUtils.setTenantId(tenantId);
//
//                if (username != null) {
//                    return new UsernamePasswordAuthenticationToken(username, null, Arrays.asList(new SimpleGrantedAuthority(role)));
//                }
//            }
//            return null;
//        } catch (Exception e) {
//            // TODO: handle exception
//            return null;
//        }
//
//    }
//}
