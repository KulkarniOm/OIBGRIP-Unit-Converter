package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Length extends AppCompatActivity {
    Button Btn_convert1;
    EditText ED_input;
    EditText ED_km;
    EditText ED_m;
    EditText ED_cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        Btn_convert1 = findViewById(R.id.button1);
        ED_input = findViewById(R.id.Lengthid1);
        ED_km = findViewById(R.id.Kilometer1);
        ED_m = findViewById(R.id.Meter1);
        ED_cm = findViewById(R.id.Centimeter1);

        Btn_convert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ED_input.getText().toString().equals(""))
                    ED_input.setError("Enter Input");
                else{
                    double Input_length = Double.parseDouble(ED_input.getText().toString());
                    double m,cm;
                    m=Input_length*1000;
                    cm=Input_length*10000;
                    ED_km.setText(ED_input.getText().toString());
                    ED_m.setText(String.valueOf(m));
                    ED_cm.setText(String.valueOf(cm));
                }
            }
        });


    }


}