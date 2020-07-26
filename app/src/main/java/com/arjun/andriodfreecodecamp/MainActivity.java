package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int enteredNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextrandomNumber = findViewById(R.id.editTextNumber);
        Button submitButton=findViewById(R.id.submitButton);
        final TextView textView=findViewById(R.id.textViewMessage);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getedittext();


                Random random = new Random();
                int randomNumber = random.nextInt(20)+1;

                int numberofTries = 0;
                boolean shouldFinish = false;
                boolean hasOwn=true;


                while (!shouldFinish) {

                    numberofTries++;

                    if (numberofTries < 5) {

                        if (enteredNumber == randomNumber) {
                            hasOwn=true;
                            shouldFinish=true;

                        }
                        else if(enteredNumber>randomNumber){
                            textView.setText("Guess lower");
                            getedittext();
                            // guess lower

                        }
                        else{
                            textView.setText("Guess higher");
                            getedittext();
                            //guess higher
                        }

                    } else {
                        shouldFinish = true;
                    }

                }

                if(hasOwn){
                    textView.setText("Congratulations you have guessed in your"+numberofTries+"guess");

                }
                else{
                    textView.setText("Game over");

                }

            }

            private void getedittext() {
                enteredNumber =Integer.parseInt(editTextrandomNumber.getText().toString());
            }
        });





    }
}
