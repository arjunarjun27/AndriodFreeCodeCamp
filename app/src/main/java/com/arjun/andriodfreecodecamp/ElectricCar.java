package com.arjun.andriodfreecodecamp;

public class ElectricCar implements CarInterface {

    String name;

    public ElectricCar(String name) {
        this.name = name;
    }


    @Override
    public void start() {
        System.out.println("Electricity Flow Started");

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+"moving at "+speed+" mph");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
