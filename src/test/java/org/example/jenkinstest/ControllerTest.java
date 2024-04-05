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
        System.out.println("te1st");
        Assertions.assertEquals(response.getBody(), "야호는무슨123123");
    }
}
