package com.arjun.andriodfreecodecamp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView tvName, tvEmail, tvPassword, tvRepassword;
    EditText etName, etEmail, etPassword, etRepassword;
    Button btnRegister, btnPickImage;
    CheckBox agreementCheck;

    Spinner countriesSpinner;
    ConstraintLayout parent;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = findViewById(R.id.parent);
        countriesSpinner = findViewById(R.id.spinner);
        tvName = findViewById(R.id.textViewName);
        tvEmail = findViewById(R.id.textViewEmail);
        tvPassword = findViewById(R.id.textViewPassword);
        tvRepassword = findViewById(R.id.textViewRepassword);
        etName = findViewById(R.id.editTextName);
        etEmail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPassword);
        etRepassword = findViewById(R.id.editTextRepassword);
        btnRegister = findViewById(R.id.buttonRegister);
        btnRegister.setOnClickListener(this);
        btnPickImage = findViewById(R.id.buttonPickImage);
        btnPickImage.setOnClickListener(this);
        agreementCheck = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        final ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("India");
        countriesList.add("Unites states");
        countriesList.add("Australia");
        countriesList.add("South Africa");
        countriesList.add("England");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countriesList);

        countriesSpinner.setAdapter(adapter);

        countriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + countriesList.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonRegister:
                initRegister();
                break;
            case R.id.buttonPickImage:
                break;

        }
    }

    private void initRegister() {
        if (validateData()) {

            if (agreementCheck.isChecked()) {
                snowSnackBar();

            } else {
                Toast.makeText(this, "You need to agree  to the license agreement", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void snowSnackBar() {
        tvName.setVisibility(View.GONE);
        tvEmail.setVisibility(View.GONE);
        tvPassword.setVisibility(View.GONE);
        tvRepassword.setVisibility(View.GONE);


        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String country = countriesSpinner.getSelectedItem().toString();
        String gender = "";
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.male:
                gender = "male";
                break;
            case R.id.female:
                gender = "female";
                break;
            case R.id.others:
                gender = "other";
                break;

        }


        String snackText = "Name" + name + "\n" + "Email :" + email + "\n" +"Country: "+ country + "\n" +"Gender "+gender;

        Snackbar.make(parent, snackText, Snackbar.LENGTH_INDEFINITE).setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etName.setText("");
                etEmail.setText("");
                etPassword.setText("");
                etRepassword.setText("");


            }
        }).show();
    }

    private boolean validateData() {
        if (etName.getText().toString().equals("")) {
            tvName.setVisibility(View.VISIBLE);
            tvName.setText("Enter your name");
            return false;
        }
        if (etEmail.getText().toString().equals("")) {
            tvEmail.setVisibility(View.VISIBLE);
            tvEmail.setText("Enter your email");
            return false;
        }
        if (etPassword.getText().toString().equals("")) {
            tvPassword.setVisibility(View.VISIBLE);
            tvPassword.setText("Enter your password");
            return false;
        }

        if (etRepassword.getText().toString().equals("")) {
            tvRepassword.setVisibility(View.VISIBLE);
            tvRepassword.setText("Enter your RePassword");
            return false;
        }

        if (!etPassword.getText().toString().equals(etRepassword.getText().toString())) {
            tvRepassword.setVisibility(View.VISIBLE);
            tvRepassword.setText("RePassword does n't match");
            return false;
        }
        return true;
    }
}
