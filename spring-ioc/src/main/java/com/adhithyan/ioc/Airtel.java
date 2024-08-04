package com.adhithyan.ioc;

public class Airtel implements Sim {
    public Airtel() {
        System.out.println("Airtel constructor called");
    }

    @Override
    public void calling() {
        System.out.println("Calling using airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing using airtel");
    }
}