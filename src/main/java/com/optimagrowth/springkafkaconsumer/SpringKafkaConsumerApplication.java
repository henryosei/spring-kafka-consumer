package com.optimagrowth.springkafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableFeignClients
public class SpringKafkaConsumerApplication {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    //consume
    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaConsumerApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(){
        return  args -> {
            jdbcTemplate.execute("CREATE TABLE items (item VARCHAR, value DECIMAL(10,2), count INTEGER)");
        };
    }
}
