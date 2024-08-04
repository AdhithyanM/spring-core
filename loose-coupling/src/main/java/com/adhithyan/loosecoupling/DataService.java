package com.adhithyan.loosecoupling;

public class DataService implements Service {
    @Override
    public void activate() {
        System.out.println("DataService activated");
    }
}
