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
        contacts.add(new Contact("arjun", "arjun@gmail.com", "https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/tiger-woods-2019-masters-tournament-champion-april-22-2019-sports-illustrated-cover.jpg"));

        contacts.add(new Contact("mohan", "mohan@gmail.com", "https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/make-it-reign-how-the-resilient-royals-ran-off-with-a-world-november-09-2015-sports-illustrated-cover.jpg"));
        contacts.add(new Contact("anandaraman", "anandaraman@gmail.com", "https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/muhammad-ali-1965-world-heavyweight-title-july-26-1999-sports-illustrated-cover.jpg"));
        contacts.add(new Contact("ashok", "ashok@gmail.com", "https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/chicago-bulls-michael-jordan-1998-nba-finals-june-22-1998-sports-illustrated-cover.jpg"));
        contacts.add(new Contact("murali", "murali@gmail.com", "https://images.fineartamerica.com/images/artworkimages/mediumlarge/2/goat-greatest-of-all-teams-february-11-2019-sports-illustrated-cover.jpg"));


        ContactsRecyclerViewAdapter contactsRecyclerViewAdapter=new ContactsRecyclerViewAdapter(this);
        contactsRecyclerViewAdapter.setContacts(contacts);

        mRecyclerView.setAdapter(contactsRecyclerViewAdapter);

       // mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }


}
