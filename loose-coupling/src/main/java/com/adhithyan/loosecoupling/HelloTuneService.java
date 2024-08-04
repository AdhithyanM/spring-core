package com.adhithyan.loosecoupling;

public class HelloTuneService implements Service {

    @Override
    public void activate() {
        System.out.println("Hello Tune service activated");
    }
}
