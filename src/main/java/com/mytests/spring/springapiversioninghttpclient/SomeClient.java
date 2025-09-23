package com.mytests.spring.springapiversioninghttpclient;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/someController", accept = "application/json")
public interface SomeClient {

    @GetExchange(version = "1.0.0")
    String test100();
    @GetExchange(version = "1.1.1")
    String test111();
    @GetExchange(version = "1.2.0")
    String test12plus();
    @GetExchange
    String testNoExplicitVersion();
}
