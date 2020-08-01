package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ListView listView;
    Spinner spinner;
    Spinner staticSpiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.myListview);
        spinner=findViewById(R.id.mySpinner);
        staticSpiner=findViewById(R.id.staticSpinner);

        final ArrayList<String> citesList=new ArrayList<>();
        citesList.add("Cheenai");
        citesList.add("Madurai");
        citesList.add("Salem");
        citesList.add("Coimbatore");


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,citesList

        );



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, citesList.get(i)+" Selected", Toast.LENGTH_SHORT).show();
            }
        });



        final ArrayList<String> spinnerdata=new ArrayList<>();
        spinnerdata.add("Arjun");
        spinnerdata.add("Murugan");
        spinnerdata.add("Kumaran");


        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,spinnerdata

        );

        
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+spinnerdata.get(i)+" Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        staticSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, staticSpiner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
