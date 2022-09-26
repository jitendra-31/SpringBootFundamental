package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController     //It is a controller class
public class RecommendationsController {
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){

        return Arrays.asList(new Movie(1, "Harry Potter", 8.0),
                             new Movie(2, "Endgame", 9.5),
                             new Movie(3, "Brahmastra", 7.5),
                             new Movie(4, "Matrix", 8.8));
    }
}
