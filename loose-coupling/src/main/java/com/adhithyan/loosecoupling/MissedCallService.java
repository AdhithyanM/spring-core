package com.adhithyan.loosecoupling;

public class MissedCallService implements Service{
    @Override
    public void activate() {
        System.out.println("Missed call service activated");
    }
}
