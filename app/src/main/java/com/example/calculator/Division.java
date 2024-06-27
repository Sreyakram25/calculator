package com.example.calculator;

import static com.example.calculator.R.id.divi;

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

public class Division extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        b1=(AppCompatButton)findViewById(R.id.divi);
        b2=(AppCompatButton) findViewById(R.id.menubtn);
        ed1=(EditText)findViewById(R.id.no1);
        ed2=(EditText)findViewById(R.id.no2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String num1= ed1.getText().toString();
                    String num2=ed2.getText().toString();
                    int n1=Integer.parseInt(num1);
                    int n2=Integer.parseInt(num2);
                    int n4=n1/n2;
                    Toast.makeText(getApplicationContext(),String.valueOf(n4),Toast.LENGTH_LONG).show();
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent L=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(L);
            }
        });

    }
}