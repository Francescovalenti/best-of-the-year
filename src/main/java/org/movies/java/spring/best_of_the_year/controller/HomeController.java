package org.movies.java.spring.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;


import org.movies.java.spring.best_of_the_year.Models.Movies;
import org.movies.java.spring.best_of_the_year.Models.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Francesco");

        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies()); 
        return "movies";
    }

    

    private List<Movies> getBestMovies() {
        List<Movies> moviesList = new ArrayList<>();

        moviesList.add(new Movies(1, "Inception"));
        moviesList.add(new Movies(2, "The Dark knight"));
        moviesList.add(new Movies(3, "Oppenhaimer"));
        return moviesList;
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSong());
        return "songs";
    }

    private List<Songs> getBestSong() {
        List<Songs> songsList = new ArrayList<>();

        songsList.add(new Songs(1, "Live Forever"));
        songsList.add(new Songs(2, "Don't Look Back in Anger"));
        songsList.add(new Songs(3, "Wonderwall"));
        return songsList;
    }

@GetMapping("/movies/{id}")
public String singleMovie(Model model, @PathVariable("id") Integer movieId) {
   boolean isMovieFound= false;
   Movies movie = null;
   for (Movies currentMovies : getBestMovies()) {
    if (currentMovies.getId() == movieId) {
        isMovieFound = true;
        movie = currentMovies;
        break;
        
    }
   }
 model.addAttribute("isFound",isMovieFound);
 model.addAttribute("movie",movie);
    return  "single-movie";
}

@GetMapping("/songs/{id}")
public String singleSongs(Model model, @PathVariable("id") Integer songId) {
   boolean isSongsFound= false;
   Songs song = null;
   for (Songs currentSongs : getBestSong()) {
    if (currentSongs.getId() == songId) {
        isSongsFound = true;
        song = currentSongs;
        break;
        
    }
   }
 model.addAttribute("isFound",isSongsFound);
 model.addAttribute("movie",song);
    return  "single-movie";
}



}
