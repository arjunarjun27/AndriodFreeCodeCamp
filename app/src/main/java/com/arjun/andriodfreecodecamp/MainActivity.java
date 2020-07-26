package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String enteredName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        Button submitButton = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.mytextview);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredName = editText.getText().toString();
                String[] names = new String[5];
                names[1] = "Arjun";
                names[2] = "Anand";


                String[] mynames = {"Arjun", "anand", "mohan", "selva"};
                int[] mark = {40, 50, 55, 87};


                for (int i = 0; i < mynames.length; i++) {

                    System.out.println(mynames[i]);
                }


                for (int i = 0; i < mynames.length; i++) {
                    if (enteredName.equals(mynames[i])) {
                        int m = mark[i];
                        textView.setText(String.valueOf(m));
                    }

                }
            }
        });





    }
}
