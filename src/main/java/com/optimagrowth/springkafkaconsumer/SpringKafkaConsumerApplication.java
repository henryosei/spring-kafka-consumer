package com.optimagrowth.springkafkaconsumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpringKafkaConsumerApplication {

    //consume
    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaConsumerApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(){
        return  args -> {
            System.out.println("Spring is awesome");
        };
    }
}
