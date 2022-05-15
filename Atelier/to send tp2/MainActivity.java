package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText itf ,itc;
    private Button btncf , btnfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti ();
        ecouteurs();
    }

    private void ecouteurs() {
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirdc_fd();
            }


        });
        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirfc_dc();
            }


        });

    }
    private void convertirfc_dc() {
        Float f = Float.parseFloat(itf.getText().toString());
        Float c = (f-32)*5/9;
        itc.setText(c+"");
    }
    private void convertirdc_fd() {
        Float c = Float.parseFloat(itc.getText().toString());
        Float f = c*9/5+32;
        itf.setText(f+"");
    }

    private void inti() {
        itf=findViewById(R.id.itf);
        itc=findViewById(R.id.itc);
        btncf=findViewById(R.id.btncf);
        btnfc=findViewById(R.id.btnfc);
    }
}