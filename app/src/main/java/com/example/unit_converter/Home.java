package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button BTN_Time, BTN_Length,BTN_Kilogram,BTN_Temperature;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BTN_Time = findViewById(R.id.Timeid);
        BTN_Kilogram = findViewById(R.id.Kilogramid);
        BTN_Length = findViewById(R.id.Lengthid);
        BTN_Temperature = findViewById(R.id.Temperatureid);

        BTN_Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              intent = new Intent(Home.this, Time.class);
              startActivity(intent);

            }
        });

        BTN_Length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Home.this,Length.class);
                startActivity(intent);


            }
        });

        BTN_Kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 intent=new Intent(Home.this,Kilogram.class);
                 startActivity(intent);

            }
        });

        BTN_Temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Home.this,Temperature.class);
                startActivity(intent);
            }
        });


    }
}