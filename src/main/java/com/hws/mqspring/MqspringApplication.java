package com.hws.mqspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MqspringApplication {


    public static void main(String[] args) {
        SpringApplication.run(MqspringApplication.class, args);
    }

}