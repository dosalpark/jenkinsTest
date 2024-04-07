package org.example.jenkinstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    @Test
    void test() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/", String.class);
        System.out.println("cp -r 테스트 + 폴더미리생성 + sudo + sudoers수정 + 실패시 push 되는지 테스트");
        Assertions.assertEquals(response.getBody(), "야호는무11111111111슨1231231");
    }
}
