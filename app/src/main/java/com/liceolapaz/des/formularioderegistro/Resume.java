package com.liceolapaz.des.formularioderegistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Resume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        Button exitButton = (Button) findViewById(R.id.buttonExit) ;
    }
    

}