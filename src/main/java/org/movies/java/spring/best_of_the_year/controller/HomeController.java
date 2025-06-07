package org.movies.java.spring.best_of_the_year.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.movies.java.spring.best_of_the_year.Models.Movies;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Francesco");

        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("videogames", getBestMovies());
              
        return "movies";
    }

    private List<Movies> getBestMovies() {
        List<Movies> moviesList = new ArrayList<>();

         moviesList.add(new Movies(1, "Inception"));
            moviesList.add(new Movies(2, "The Dark knight"));
            moviesList.add(new Movies(3, "Oppenhaimer"));
            return moviesList;
    }

    
    @GetMapping("/song")
    public String song(Model model) {
        model.addAttribute("videogames", getBestSong());
              
        return "song";

}
 private List<Movies> getBestSong() {
        List<Movies> songsList = new ArrayList<>();

         songsList.add(new Movies(1, "Live Forever"));
            songsList.add(new Movies(2, "Don't Look Back in Anger"));
            songsList.add(new Movies(3, "Wonderwall"));
            return songsList;
    }

}
