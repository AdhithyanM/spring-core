package com.adhithyan.di;

public class Student {
    private String name;
    private MathCheatSheet mathCheatSheet;

    public Student(String name, MathCheatSheet mathCheatSheet) {
        this.name = name;
        this.mathCheatSheet = mathCheatSheet;
    }

    public MathCheatSheet getMathCheatSheet() {
        return mathCheatSheet;
    }

    public String getName() {
        return name;
    }
}
