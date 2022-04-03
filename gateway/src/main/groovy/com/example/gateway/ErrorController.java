package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;

@RestController
class ErrorController extends Throwable {
    @GetMapping("/api/error") Single<String> index(){
        return Single.just("Service 1 is down. Please try again.");
    }
}
