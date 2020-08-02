package com.arjun.andriodfreecodecamp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("arjun", "", ""));

        contacts.add(new Contact("mohan", "", ""));
        contacts.add(new Contact("anandaraman", "", ""));
        contacts.add(new Contact("ashok", "", ""));
        contacts.add(new Contact("murali", "", ""));


        ContactsRecyclerViewAdapter contactsRecyclerViewAdapter=new ContactsRecyclerViewAdapter(this);
        contactsRecyclerViewAdapter.setContacts(contacts);

        mRecyclerView.setAdapter(contactsRecyclerViewAdapter);

       // mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }


}
