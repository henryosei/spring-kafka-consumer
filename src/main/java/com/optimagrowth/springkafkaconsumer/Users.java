package com.optimagrowth.springkafkaconsumer;

public class Users {

    private String firstName;
    private String lastName;
    private String email;

    public Users(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
