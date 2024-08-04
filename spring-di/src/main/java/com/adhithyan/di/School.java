package com.adhithyan.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student.getMathCheatSheet().getId());

        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher.getMathCheatSheet().getId());

    }
}
