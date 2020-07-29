package com.arjun.andriodfreecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.btnHello);
        button.setOnClickListener(this);
        textView = findViewById(R.id.txtHello);

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Long press", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnHello:
                textView.setText("Hello " + editText.getText().toString());
                break;

        }

    }
}
