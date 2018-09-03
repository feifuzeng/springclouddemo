package com.feifz.eurekaprivoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaPrivoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaPrivoderApplication.class, args);
    }
}
