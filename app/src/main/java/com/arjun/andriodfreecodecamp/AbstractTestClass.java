package com.arjun.andriodfreecodecamp;

public abstract class AbstractTestClass {

    private String name;

    public AbstractTestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printName();

    public void print(){
        System.out.println(this.getName());
    }

}
