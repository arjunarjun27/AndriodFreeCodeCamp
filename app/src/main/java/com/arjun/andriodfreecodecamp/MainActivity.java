package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Arithmetic Operator +,-,*,/,%

        int a =5;
        a+=2;
        int b=2;
        b++; // 3
        b--;//2

        // relational or comparison operator <.<=,>,>=,==,!=

        boolean answaer =a<b;


        // logical operator ||,&&,

        boolean ans=a==5 || b==2;




    }
}
