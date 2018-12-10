package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.TenantContextHolder;
import com.example.demo.entity.User;
import com.example.demo.model.Movie;
import com.example.demo.model.UserDetails;
import com.example.demo.service.MovieService;
import com.example.demo.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class APIController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private UserService userService;



    // this is the login api/service
    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> user(@RequestBody User user, HttpServletRequest req) {
        System.out.println("/authenticate1");
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        
        String tenantId = user.getTenantId();
        System.out.println(user.getTenantId().toString());
        TenantContextHolder.setTenantId(tenantId);
        User loadUser = userService.loadUserByUsername(user.getUsername());
        if (loadUser != null) {
            String passwordEncode = loadUser.getPassword();
            if (passwordEncoder.matches(user.getPassword(), passwordEncode)) {
                //
                System.out.println("/authenticate2");
                // check
                req.getSession().setMaxInactiveInterval(30);
                return new ResponseEntity<>(new UserDetails(tenantId, user.getUsername(), loadUser.getRole().getRolename()), HttpStatus.OK);
            }

        }
        //
        System.out.println("/authenticate2");
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping("/movies")
    public List<Movie> movies(HttpServletRequest req) {
        System.out.println("movies");
        req.getUserPrincipal();
    //    System.out.println(req.getUserPrincipal().toString());
        return movieService.getMovies();
    }

    @RequestMapping("/movies/{id}")
    public Movie movieById(@PathVariable("id") int id) {

        return movieService.getMovieById(id);
    }

}
