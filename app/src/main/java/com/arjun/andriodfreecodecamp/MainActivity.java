package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 5;

        if (a > 3) {
            System.out.println("A is greater than 3");
        } else {
            System.out.println("A is lesser than 3");

        }


        if(a>0){
            System.out.println("A is positive");
        }
        else if(a<0){
            System.out.println("A is negative");
        }

        else{
            System.out.println("A is zero");
        }




        switch (a){
            case 1:
                System.out.println("A is one");
                break;

            case 2:
                System.out.println("A is two");
                break;
            case 5:
                System.out.println("A is five");
                break;


        }

    }
}
