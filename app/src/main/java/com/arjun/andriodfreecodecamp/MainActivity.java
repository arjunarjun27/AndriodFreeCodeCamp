package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarInterface carInterface=new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);


        List<String> names=new ArrayList<>();
        names.add("Arjun");


        CarInterface fosilfuel=new FosilFuelCar("Mercendes");
        fosilfuel.start();
        fosilfuel.move(70);




//        CarInterface carInterface=new CarInterface() {
//            @Override
//            public void start() {
//
//            }
//
//            @Override
//            public void move(int speed) {
//
//            }
//        };


    }
}
