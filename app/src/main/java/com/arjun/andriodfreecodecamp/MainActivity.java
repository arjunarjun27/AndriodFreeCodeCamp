package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // inheritance
        Bird phoenix=new Bird("Nina","Golden",2,true,2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");



        // composition
        Car mercedens=new Car("Mercendenz",2,"Silver",new Engine("Renault",8000));
        System.out.println(mercedens.getEngine().getModel());




        // null means nothing

        Car car=null;
        car.getColor(); // throw a nullpointerexception

        if(car!=null){
            System.out.println("is there");
        }
        else{
            System.out.println("null");

        }
    }
}
