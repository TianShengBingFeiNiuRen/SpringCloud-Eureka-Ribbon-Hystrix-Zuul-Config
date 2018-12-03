package com.andon.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectController {

    @Value(value = "${server.port}")
    private String port;

    @GetMapping(value = "/hello")
    public String hello(String name) {
        return "Hello " + name + ", i am from port: " + port;
    }
}
