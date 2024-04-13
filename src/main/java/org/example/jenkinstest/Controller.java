package org.example.jenkinstest;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String index(){
        System.out.println("github.hand_ref 테스트");
        return "야호123";
    }
}
