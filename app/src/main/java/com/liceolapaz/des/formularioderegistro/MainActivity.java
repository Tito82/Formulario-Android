package com.liceolapaz.des.formularioderegistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner country = (Spinner) findViewById(R.id.country);
        Button registerButton = (Button) findViewById(R.id.registerButton);
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText surnameEditText = (EditText) findViewById(R.id.surnameEditText);
        EditText mailEditText = (EditText) findViewById(R.id.editTextEmailAddress);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        EditText editTextPasswordCheck = (EditText) findViewById(R.id.editTextPasswordCheck);
        Button exitButton = (Button) findViewById(R.id.buttonExit) ;
        String[] paises = {"España","Italia","Francia","Portugal"};
        country.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, paises));
        Intent intent = new Intent(MainActivity.this, Resume.class);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creamos el Intent
                Intent iName = new Intent(MainActivity.this, Resume.class);
                //Creamos la información a pasar entre actividades
                Bundle bName = new Bundle();
                bName.putString("NOMBRE", nameEditText.getText().toString());
                //Añadimos la información al intent
                iName.putExtras(bName);
                startActivity(iName);

                Intent iSurname= new Intent(MainActivity.this, Resume.class);
                //Creamos la información a pasar entre actividades
                Bundle bSurname = new Bundle();
                bSurname.putString("APELLIDO", surnameEditText.getText().toString());
                //Añadimos la información al intent
                iSurname.putExtras(bSurname);
                startActivity(iSurname);

            }
        });

        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(nameEditText.getText() != null && nameEditText.getText().length() < 1) nameEditText.setError("Este campo es obligatorio");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        surnameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(surnameEditText.getText() != null && surnameEditText.getText().length() < 1) surnameEditText.setError("Este campo es obligatorio");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(!mailEditText.getText().toString().trim().matches(emailPattern) && mailEditText.getText().length() > 0) {
                    mailEditText.setError("Email invalido");
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(editTextPassword.getText() != null && editTextPassword.getText().length() < 1) editTextPassword.setError("Este campo es obligatorio");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editTextPasswordCheck.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                System.out.println(editTextPasswordCheck.getText().equals(editTextPassword.getText()));
                if(editTextPasswordCheck.getText() != null && editTextPasswordCheck.getText().length() > 0 && !editTextPasswordCheck.getText().toString().trim().equals(editTextPassword.getText().toString().trim())) {
                    editTextPasswordCheck.setError("La contraseña no coincide");
                }
            }
        });
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);

            }
        });



    }
}