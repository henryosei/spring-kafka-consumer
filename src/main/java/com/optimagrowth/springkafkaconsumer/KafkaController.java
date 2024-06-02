package com.optimagrowth.springkafkaconsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class KafkaController {

    @Autowired
    private FeinInterface feinInterface;



    @PostMapping("users")
    public ResponseEntity<Users> getUsers() {
        Users users = feinInterface.getUser();
        return ResponseEntity.ok().body(users);
    }
}
