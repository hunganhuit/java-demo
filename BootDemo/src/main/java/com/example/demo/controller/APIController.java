package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import com.example.demo.service.UserDetailsServiceImp;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class APIController {
    @Autowired
    private Map<String, DataSource> dataSourcesMtApp;
    @Autowired
    private MovieService movieService;

    @Autowired
    private UserDetailsServiceImp userDetailsServiceImp;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestParam("tenantId") final String tenantId, @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        System.out.println(username);
        System.out.println(tenantId);
        if (!this.dataSourcesMtApp.containsKey(tenantId)) {
            System.out.println("resolveCurrentTenantIdentifier2 " + tenantId);
            return new ResponseEntity<>("TenantId is not found!", HttpStatus.UNAUTHORIZED);

        } ;
        // return new User();
        // return userDetailsServiceImp.loadUserByUsername(username);
        System.out.println(userDetailsServiceImp.loadUserByUsername(username).toString());
        return new ResponseEntity<UserDetails>(userDetailsServiceImp.loadUserByUsername(username), HttpStatus.OK);
    }


    @RequestMapping("/movies")
    public List<Movie> movies() {
        System.out.println("movies");


        // System.out.println(SecurityContextHolder.getContext().getAuthentication().);
        return movieService.getMovies();
    }

    @RequestMapping("/movies/{id}")
    public Movie movieById(@PathVariable("id") int id) {

        return movieService.getMovieById(id);
    }

}
