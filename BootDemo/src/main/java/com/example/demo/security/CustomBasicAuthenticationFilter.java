package com.example.demo.security;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.example.demo.common.TenantContextHolder;

public class CustomBasicAuthenticationFilter extends BasicAuthenticationFilter {
    @Autowired
    private Map<String, DataSource> dataSourcesMtApp;

    @Autowired
    public CustomBasicAuthenticationFilter(final AuthenticationManager authenticationManager) {
        
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        String tenantId = request.getParameter("tenantId");
        System.out.println("doFilterInternal1 " +tenantId);
//        if (!this.dataSourcesMtApp.containsKey(tenantId)) {
//            System.out.println("doFilterInternal2 " + tenantId);
//            throw new ServletException("TenantId : " + tenantId + " is not found!!");
//
//        } ;
        TenantContextHolder.setTenantId(tenantId);
        super.doFilterInternal(request, response, chain);
    }

//    @Override
//    protected void onSuccessfulAuthentication(final HttpServletRequest request, final HttpServletResponse response, final Authentication authResult) {
//        //Generate Token
//        //Save the token for the logged in user
//        //send token in the response
//        response.setHeader("header-name" , "token");
//
//
//    }

}