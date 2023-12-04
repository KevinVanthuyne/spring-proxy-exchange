package com.example.springproxyexchange;

import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rules/integration")
public class RulesController {
    @PostMapping
    public ResponseEntity<?> post(ProxyExchange<byte[]> proxy) {
        return proxy.uri("http://localhost:8083/api/v1/rules/integration").post();
    }
}
