package com.gabryellr.feignclientsaverequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientSaveRequestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientSaveRequestsApplication.class, args);
    }

}