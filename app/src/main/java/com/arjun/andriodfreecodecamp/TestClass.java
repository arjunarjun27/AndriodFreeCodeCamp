package com.arjun.andriodfreecodecamp;

public class TestClass extends AbstractTestClass {

    public TestClass(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println(""+this.getName());

    }
}
