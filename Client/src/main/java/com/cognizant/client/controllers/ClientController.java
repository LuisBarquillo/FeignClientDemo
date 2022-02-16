package com.cognizant.client.controllers;

import com.cognizant.client.services.FeignClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final FeignClientService feignClientService;

    public ClientController(FeignClientService feignClientService) {
        this.feignClientService = feignClientService;
    }

    @GetMapping("/data")
    public String getDataFromServer() {
        return feignClientService.getDataFromServer();
    }
}
