package com.adhithyan.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        // Don't touch source code. Make the app configurable.
        // Spring can create and manage objects for us.
//        Sim sim = new Airtel();
//        sim.calling();
//        sim.data();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Airtel airtel1 = (Airtel) context.getBean("airtel");
//        Airtel airtel2 = context.getBean("airtel", Airtel.class);

        // now with this we don't need to modify source code and can just toggle the respective beans in config xml
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();
        sim.calling();
    }
}
