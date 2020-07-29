package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CheckBox checkBox;
    RadioGroup rgMartialStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox1);
        rgMartialStatus=findViewById(R.id.rgMartialstatus);


        if (checkBox.isChecked()) {
            Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();

        }


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();

                }

            }
        });


        int id=rgMartialStatus.getCheckedRadioButtonId();
        switch (id){
            case R.id.single:
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.married:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relationship:
                Toast.makeText(MainActivity.this, "Relationship", Toast.LENGTH_SHORT).show();

                break;
        }
        rgMartialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.single:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.married:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.relationship:
                        Toast.makeText(MainActivity.this, "Relationship", Toast.LENGTH_SHORT).show();

                        break;
                }



            }
        });


    }

}
