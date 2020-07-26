package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // loops


        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        int a = 5;

        while (a < 10) {
            a++;

            if (a == 8) {
                continue;
            }

            System.out.println("Hello");

        }


        do {
            System.out.println("Hello");

        } while (a >5);

    }
}
