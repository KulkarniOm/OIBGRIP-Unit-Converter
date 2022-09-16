package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    Button Btn_convert;
    TextView TV1;
    EditText ED1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        Btn_convert = findViewById(R.id.Bid);
        ED1 = findViewById(R.id.idtemp);
        TV1 = findViewById(R.id.TV_Fh);
        Btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ED1.getText().toString().equals(""))
                {
                    ED1.setError("Enter Input");
                }
                else
                {
                       Double input=Double.parseDouble(ED1.getText().toString());
                       double f;
                       f=(input*1.8)+32;
                       TV1.setText(String.valueOf(f));
                }
            }
        });
    }
}