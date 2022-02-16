package com.cognizant.client.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "localserver", url = "http://localhost:19950/")
public interface FeignClientService {

    @GetMapping("/data")
    String getDataFromServer();
}
