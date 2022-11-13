package com.bts.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${some.property}")
    private String someProperty;

    @GetMapping("/test")
    public void test() {
        System.out.println(someProperty);
    }

}
