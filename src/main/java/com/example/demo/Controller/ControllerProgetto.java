package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.Model.Movie;
import com.example.demo.Model.Song;



@RestController
@RequestMapping("/best-of-/*")
public class ControllerProgetto {



   @GetMapping("/Movie")
    public Movie film() {
        return new Movie();
    }
    
    @GetMapping("/Song")
    public Song canzone() {
        return new Song();
    }
}


