package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dashboard.launchDashboard();

        Login u1 = new Login("Kamil", "pass");
        u1.login();
    }
}