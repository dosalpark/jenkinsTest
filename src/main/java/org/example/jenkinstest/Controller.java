package org.example.jenkinstest;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String index(){
        System.out.println("기능브랜치에서 main브랜치로 pr 테스트 - 안되야됨");
        return "야호123";
    }
}
