package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Time extends AppCompatActivity {
    Button BTN_Convert;
    EditText ED_input;
    TextView TV_output;
    TextView TV_h;
    TextView TV_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        BTN_Convert = findViewById(R.id.Convertid);
        ED_input = findViewById(R.id.ET_input);
        TV_output = findViewById(R.id.TV_Output);
        TV_h = findViewById(R.id.houres1);
        TV_m = findViewById(R.id.Minits1);

        BTN_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(ED_input.getText().toString().equals(""))
               {
                   ED_input.setError("Enter Time");
               }
               else
               {
                  int time=Integer.parseInt(ED_input.getText().toString());
                  int m,s;
                  m=time*60;
                  s=time*360;
                  TV_h.setText(ED_input.getText().toString());
                  TV_m.setText(String.valueOf(m));
                  TV_output.setText(String.valueOf(s));
               }
            }
        });




    }
    private int convert(int it)
    {
        it=it*360;
        return it;
    }


}