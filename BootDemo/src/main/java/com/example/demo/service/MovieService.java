package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.common.DemoUtil;
import com.example.demo.model.Movie;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        List<Movie> movies = (List<Movie>) DemoUtil.readJsonFile("D:\\movies.json", new TypeReference<List<Movie>>() {});
        return movies;
    }

    public Movie getMovieById(int id) {
        List<Movie> movies = (List<Movie>) DemoUtil.readJsonFile("D:\\movies.json", new TypeReference<List<Movie>>() {});
        for (Movie movie : movies) {
            if (movie.getId() == id)
                return movie;
        }
        return null;
    }
}
