package com.optimagrowth.springkafkaconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "feignTest",url = "${gdpc.url}")
public interface FeinInterface {

    @PostMapping("/portal")
    Users getUser();
}
