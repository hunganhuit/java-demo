package com.example.demo.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class CORSFilter  extends GenericFilterBean{
    public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse response = (HttpServletResponse) res;
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
            response.addHeader("Access-Control-Max-Age", "3600");
            response.addHeader("Access-Control-Allow-Headers", "X-Requested-With, X-Auth-Token");
            response.addHeader("Access-Control-Allow-Credentials", "true");
System.out.println("asaasasa");
            if(req.getMethod().equalsIgnoreCase("options")){
                System.out.println("asaasasa");

                 return;
            }
            chain.doFilter(request, response);
        }

}
