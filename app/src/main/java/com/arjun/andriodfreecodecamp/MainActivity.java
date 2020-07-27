package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bird phoenix=new Bird("Nina","Golden",2,true,2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");



    }
}
