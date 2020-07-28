package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // worker thread
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=0;i<5;i++){
                    System.out.println("Printing "+i+"in a worker thread");
                    try {
                        Thread.sleep(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        thread.start();


        // main thread
        for (int i=0;i<5;i++){
            System.out.println("Printing "+i+"in a Main thread");
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
