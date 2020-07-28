package com.arjun.andriodfreecodecamp;

public class FosilFuelCar implements CarInterface , TestInterface{

    String name;

    public FosilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder caused the engine to start");

    }

    @Override
    public void move(int speed) {

        System.out.println(this.getName()+"is moving at"+speed +" mph");
    }

    @Override
    public void printName(String name) {

    }
}
