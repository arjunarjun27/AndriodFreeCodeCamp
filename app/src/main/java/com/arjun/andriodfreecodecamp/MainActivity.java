package com.arjun.andriodfreecodecamp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);

        // set font in programmimg


        //Typeface typeface=getResources().getFont(R.font.lobster_two_bold); //requires  26
        Typeface typeface= ResourcesCompat.getFont(this,R.font.lobster_two_bold);


        button.setTypeface(typeface);

    }


}
