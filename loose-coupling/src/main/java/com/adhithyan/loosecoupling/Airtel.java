package com.adhithyan.loosecoupling;

public class Airtel {
    Service service;

    public Airtel(Service service) {
        this.service = service;
    }

    public void activate() {
        service.activate();
    }
}
