package org.example;

public class Main {
    public static void main(String[] args) {

        //REGISTER
        Register register = new Register();
        register.setVisible(true);
        System.out.println("Hello world!");

        Dashboard.launchDashboard();

        Login u1 = new Login("Kamil", "pass");
        u1.login();
    }
}