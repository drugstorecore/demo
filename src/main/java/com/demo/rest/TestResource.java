package com.demo.rest;

import com.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestResource {
    private final TestService testService;

    public TestResource(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/test")
    public Boolean test() {
        return testService.test();
    }
}
