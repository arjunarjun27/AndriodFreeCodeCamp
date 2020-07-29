package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CheckBox checkBox;
    RadioGroup rgMartialStatus;

    ProgressBar mProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox1);
        rgMartialStatus = findViewById(R.id.rgMartialstatus);
        mProgressbar = findViewById(R.id.progressBar);

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


        int id = rgMartialStatus.getCheckedRadioButtonId();
        switch (id) {
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
                switch (checkedId) {
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



        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    mProgressbar.incrementProgressBy(10);
                    SystemClock.sleep(500);    // like a thread.sleep available in android.os
                }

            }
        });


        thread.start();
    }

}
