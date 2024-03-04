package org.example.demo_ci_cd.controller;

import lombok.RequiredArgsConstructor;
import org.example.demo_ci_cd.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // final을 붙인 레이어에 자동으로 의존성 주입.
public class TestController {

    private final TestService testService;


    @GetMapping("/test")
    public String getTestString() {
        return testService.getTestString();
    }

}