package com.adhithyan.di;

public class Teacher {
    private MathCheatSheet mathCheatSheet;

    public Teacher(MathCheatSheet mathCheatSheet) {
        this.mathCheatSheet = mathCheatSheet;
    }

    public MathCheatSheet getMathCheatSheet() {
        return mathCheatSheet;
    }
}
