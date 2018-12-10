//package com.example.demo;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import com.example.demo.entity.Role;
//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepository;
//
//@Component
//public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent arg0) {
//        
//        // TODO Auto-generated method stub
//        User admin = new User();
//        admin.setUsername("admin1");
//        admin.setPassword(passwordEncoder.encode("admin"));
//        admin.setBirthday(new Date());
//        admin.setRegistration_day(new Date());
//        admin.setGender("male");
//        admin.setTenantId("pb01");
//        Role role = new Role();
//        role.setId(1);
//        role.setRolename("ADMIN");
//        admin.setRole(role);
//        if(userRepository.findByUsername("admin1") == null)
//        {
//            userRepository.save(admin);
//        }
//        
//    }
//
//}
