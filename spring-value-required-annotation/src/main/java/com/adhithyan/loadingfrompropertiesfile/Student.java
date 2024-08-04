package com.adhithyan.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.interestedCourse}")
    private String interestedCourse;
    @Value("${student.hobby}")
    private String hobby;

//    @Required() - deprecated during spring 5.1 and if we need required field then have it in constructor injection
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setInterestedCourse(String interestCourse) {
        this.interestedCourse = interestCourse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student interest course: " + interestedCourse);
        System.out.println("Student hobby: " + hobby);
    }
}
