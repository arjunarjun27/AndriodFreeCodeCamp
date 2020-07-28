package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TestClass.name="Arjun";

        TestClass testClass=new TestClass(25,"White");
        System.out.println("Name :"+testClass.getName());

        TestClass testClass2=new TestClass(25,"White");
        System.out.println("Name :"+testClass2.getName());


        TestClass.printSomething();


    }
}
