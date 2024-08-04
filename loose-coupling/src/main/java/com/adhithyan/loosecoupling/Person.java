package com.adhithyan.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Airtel airtel = applicationContext.getBean("airtel", Airtel.class);
        airtel.activate();
    }
}
