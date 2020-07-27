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


        // final

        final int a=1;
      //  a=a+1 // copile time error



        final  Engine engine=new Engine("renault",8000);
        //engine=new Engine("suzuki",500);  you cannot change the whole instance but you can change the properties
        engine.setModel("honda");






    }
}
