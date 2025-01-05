package com.abbascoban.daireapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DaireAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaireAppApplication.class, args);
    }

}
