package com.liceolapaz.des.formularioderegistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resume extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        Button exitButton = (Button) findViewById(R.id.buttonExit1);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        TextView userName1 = (TextView) findViewById(R.id.userName1);
        setContentView(R.layout.activity_resume);
        userName1 = (TextView) findViewById(R.id.userName1);
        Bundle bName= this.getIntent().getExtras();
        userName1.setText(bName.getString("NOMBRE"));

        TextView userSurname1 = (TextView) findViewById(R.id.userSurname1);
        setContentView(R.layout.activity_resume);
        userSurname1 = (TextView) findViewById(R.id.userSurname1);
        Bundle bSurname = this.getIntent().getExtras();
        userSurname1.setText(bSurname.getString("APELLIDO"));


        TextView userPhone = (TextView) findViewById(R.id.userPhone1);
        TextView userDate = (TextView) findViewById(R.id.userDate1);
        TextView userCountry = (TextView) findViewById(R.id.userCountry1);
        TextView userMail = (TextView) findViewById(R.id.userMail1);
        TextView userSex = (TextView) findViewById(R.id.userSex1);

    }
}
