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
//
//package com.example.demo.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.access.channel.ChannelProcessingFilter;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    UserDetailsService userDetailsServiceImp;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    };
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.userDetailsService(userDetailsServiceImp).passwordEncoder(passwordEncoder());
//    }
//
//    /**
//     * This is where access to various resources (urls) in the application is defined
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        System.out.println("configure");
//    //   http.addFilterBefore(new CORSFilter(), ChannelProcessingFilter.class);
//        http.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//        http.csrf().disable();
// 
//
//        http.authorizeRequests().antMatchers("/login").permitAll();
//
//        http.authorizeRequests().antMatchers("/user/**").hasAnyAuthority("USER");
//
//        http.authorizeRequests().antMatchers("/admin/**").hasAnyAuthority("ADMIN");
//      //  http.authorizeRequests().antMatchers("/**").authenticated();
//        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
//        http.authorizeRequests().and().formLogin()//
//                .loginPage("/login")
//                // Logout Page.
//                .and().logout().logoutUrl("/logout");
//
//
//    }
//
//    /**
//     * Create an instance of the custom authentication filter which intercepts and processes the end
//     * user's login form submission for further authentication processing. This filter is added
//     * before other filters so that it can intercept the user login form submission and extract the
//     * the additional 'tenant' field
//     * 
//     * @return
//     * @throws Exception
//     */
//    public CustomAuthenticationFilter authenticationFilter() throws Exception {
//
//        CustomAuthenticationFilter filter = new CustomAuthenticationFilter();
//        filter.setAuthenticationManager(authenticationManagerBean());
//        filter.setAuthenticationFailureHandler(failureHandler());
//        filter.setAuthenticationSuccessHandler(successHandler());
//        return filter;
//    }
//
//
//    /**
//     * The page to show if authentication fails
//     * 
//     * @return
//     */
//    public SimpleUrlAuthenticationFailureHandler failureHandler() {
//        return new SimpleUrlAuthenticationFailureHandler("/login?error=true");
//    }
//
//    public SimpleUrlAuthenticationSuccessHandler successHandler() {
//        return new SimpleUrlAuthenticationSuccessHandler("/welcome");
//    }
//
//
//}
