package org.example.messagingapiapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("oracle")
    public String printGreetings() {
        return "Hi Oracle OTH C Block!!";
    }
    @GetMapping
    public String print() {
        return "Hi Guest !!";
    }
    
}