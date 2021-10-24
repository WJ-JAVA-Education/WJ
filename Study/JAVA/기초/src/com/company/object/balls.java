package com.company.object;

public  class balls {
    private String name;
    private String color;
    private int speed = 1;
    private int spped2 = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpped2() {
        return spped2;
    }

    public void setSpped2(int spped2) {
        this.spped2 = spped2;
    }

    public int speedUp(int spped1 , int spped2) {
        this.speed = spped1;
        this.spped2 = spped2;
        int total_speed = this.speed + this.spped2;
        return total_speed;
    }
}
