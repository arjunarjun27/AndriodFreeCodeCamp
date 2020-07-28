package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lists

        ArrayList<String> names=new ArrayList<>();
       // List<String> mylist=new ArrayList<>();// using interfaces


        names.add("Arjun");
        names.add("Anand");
        names.add("mohan");
        names.add("Sachin");
        names.get(0);

        names.clear();
        names.contains("Arjun");
        names.remove("mohan");
        names.indexOf("Arjun");



        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }



        // Map

        Map<String,String> emailList=new HashMap<>();
        emailList.put("arjun","arjunarjun27@gmail.com");
        emailList.put("mohan","mohan@gmail.com");
        emailList.put("anaand","anaand@gmail.com");

        emailList.get("arjun");
        emailList.containsKey("arjun");
        emailList.containsValue("arjunarjun27@gmail.com");






    }
}
