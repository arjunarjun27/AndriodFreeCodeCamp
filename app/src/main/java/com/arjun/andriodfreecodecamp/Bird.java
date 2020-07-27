package com.arjun.andriodfreecodecamp;

public class Bird extends Animal {


    private int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }
    

    // this is also polymortphim same method in child and parent behave differently
    @Override
    public void eat(String food) {
        System.out.println("Chewing" + food);
    }


    // polymorphism -many forms
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed) {
        System.out.println(this.getName() + " is flying" + speed);
    }


    public void fly(String name) {
        System.out.println(this.getName() + " is flying" + name);
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
