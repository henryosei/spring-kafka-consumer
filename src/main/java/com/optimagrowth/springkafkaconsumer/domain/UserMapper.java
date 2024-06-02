package com.optimagrowth.springkafkaconsumer.domain;

import com.optimagrowth.springkafkaconsumer.Users;

public class UserMapper {

    public Users toUser(UserDto user) {
        Users users=new Users(user.getFirstName(),user.getLastName(),null);
        return users;
    }
}
