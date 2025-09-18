package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button b;
    String name="admin";
    String ps="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        b=findViewById(R.id.login);
        b.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inname = username.getText().toString();
                String inpass = password.getText().toString();
                if(inname.equals(name) && inpass.equals(ps))
                {

                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"login failed",Toast.LENGTH_SHORT).show();
                }
            }
        }));
    }
}
