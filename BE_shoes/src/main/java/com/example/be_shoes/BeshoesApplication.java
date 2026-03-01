package com.example.be_shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BeshoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeshoesApplication.class, args);
    }

}
