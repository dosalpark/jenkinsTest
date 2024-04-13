package org.example.jenkinstest;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String index(){
        System.out.println("작업브랜치에서 메인브랜치로 pr 테스트");
        return "야호123";
    }
}
