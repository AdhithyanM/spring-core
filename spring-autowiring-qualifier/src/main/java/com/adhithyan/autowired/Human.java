package com.adhithyan.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;

    public Human() {}

//    @Autowired
    // whenever more than 1 bean matching for an autowire, we need to specifically tell spring to take a particular bean
//    @Qualifier("humanHeart")   // not applicable for constructor because there can be multiple dependencies
    public Human(Heart heart) {
        this.heart = heart;
    }


    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping() {
        if(heart != null) {
            heart.pump();
            System.out.println("name of the living being is: "+heart.getNameOfLivingBeing()
                                + " no of heart present: "+heart.getNumber_of_hearts());
        } else {
            System.out.println("you are dead!");
        }
    }
}
