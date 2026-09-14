package org.example.principletestingprototype.controller;

import org.example.principletestingprototype.DTO.HelloWorldDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld")

public class HelloWorld {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping
    public ResponseEntity<String> helloWorldPost(@RequestBody HelloWorldDTO helloWorldDTO ) {
        String result = "Hello World";
        String input = helloWorldDTO.name;
        if (input.equals(result) ){
            return ResponseEntity.ok("Access granted - welcome :D");
        }
        else{
            return ResponseEntity.ok("Access denied");
        }
    }

}
