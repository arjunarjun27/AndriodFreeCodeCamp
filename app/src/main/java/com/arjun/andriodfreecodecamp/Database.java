package com.arjun.andriodfreecodecamp;

public class Database {

    private String name;

    private static Database instance;

    public static synchronized Database getInstance(String name){

        if(null==instance){
            instance=new Database(name);
        }
        return  instance;
    }



    private Database(String name) {
        this.name = name;
    }
}
