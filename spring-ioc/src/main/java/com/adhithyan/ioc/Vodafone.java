package com.adhithyan.ioc;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling using vodafone");
    }

    @Override
    public void data() {
        System.out.println("Browsing using vodafone");
    }
}