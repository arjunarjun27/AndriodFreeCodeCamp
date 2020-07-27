package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Phone iphone=new Phone("iphone",24,2,10);
        iphone.getMemoryRam();
        iphone.playMusic();


        Phone pixel=new Phone("pixel",3);
        pixel.getMemoryRam();


    }
}
