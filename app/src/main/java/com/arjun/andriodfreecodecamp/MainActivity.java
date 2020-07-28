package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int a = 5;
        int b = 0;

        try {
            int answer = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        String name = null;
        try {
            name.equals("arjun");

        } catch (NullPointerException e) {

        }
    }
}
