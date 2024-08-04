package com.adhithyan.autowired;

public class Heart {

    // we can't autowire primitive types and wrapper classes, String.
    // autowire works only on Objects
    private String nameOfLivingBeing;
    private int number_of_hearts;

    public String getNameOfLivingBeing() {
        return nameOfLivingBeing;
    }

    public void setNameOfLivingBeing(String nameOfLivingBeing) {
        this.nameOfLivingBeing = nameOfLivingBeing;
    }

    public int getNumber_of_hearts() {
        return number_of_hearts;
    }

    public void setNumber_of_hearts(int number_of_hearts) {
        this.number_of_hearts = number_of_hearts;
    }

    public void pump() {
        System.out.println("heart is pumping");
    }
}
