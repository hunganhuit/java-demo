/**
 * 
 */
package com.example.demo.service;

import com.example.demo.entity.User;



public interface UserService {

    void save(User user);

    String findLoggedInUsername();

   // User findByUsernameAndTenantId(String username, String tenantId);
}
