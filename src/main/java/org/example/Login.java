package org.example;

public class Login {
    String username;
    String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(){
        System.out.println("User has been logged in");
    }
}
