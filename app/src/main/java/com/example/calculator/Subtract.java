package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Subtract extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText ed1,ed2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtract);
        b1=(AppCompatButton)findViewById(R.id.subt);
        b2=(AppCompatButton) findViewById(R.id.menubtn);
        ed1=(EditText)findViewById(R.id.no1);
        ed2=(EditText)findViewById(R.id.no2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1= ed1.getText().toString();
                String num2=ed2.getText().toString();
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                int sub=n1-n2;
                Toast.makeText(getApplicationContext(),String.valueOf(sub),Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });

    }
}

