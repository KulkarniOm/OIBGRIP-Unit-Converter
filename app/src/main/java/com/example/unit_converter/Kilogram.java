package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kilogram extends AppCompatActivity {

    Button BTN1;
    EditText ED1;
    TextView TV1;
    TextView TV2;
    TextView TV3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram);

        BTN1 = findViewById(R.id.BTN_1);
        ED1 = findViewById(R.id.waight1);
        TV1 = findViewById(R.id.TV_kg);
        TV2 = findViewById(R.id.TV_g);
        TV3 = findViewById(R.id.TV_mg);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ED1.getText().toString().equals(""))
                {
                    ED1.setError("Enter Input");
                }
                else
                {
                    double input_waight = Double.parseDouble(ED1.getText().toString());
                    double g,mg;
                    g = input_waight*1000;
                    mg = input_waight*1000000;
                    TV1.setText(ED1.getText().toString());
                    TV2.setText(String.valueOf(g));
                    TV3.setText(String.valueOf(mg));
                }
            }
        });
    }
}