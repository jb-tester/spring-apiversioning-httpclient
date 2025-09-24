package com.mytests.spring.springapiversioninghttpclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/someController")
public class SomeController {

    @GetMapping(version = "version1.0.0")
    public String test100() {
        return "test 1.0.0";
    }

    @GetMapping()
    public String testNoExplicitVersion() {
        return "test No Explicit Version";
    }

    @GetMapping(version = "1.1.1")
    public String test111() {
        return "test 1.1.1";
    }

    @GetMapping(version = "plus_version1.2+")
    public String test12plus() {
        return "test 1.2+";
    }
}
