package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"OnCreate Called",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this,"OnStart Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(MainActivity.this,"OnRestart Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this,"OnResume Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,"OnPause Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this,"OnStop Called",Toast.LENGTH_SHORT).show();
    }
    @Override

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this,"OnDestroy Called",Toast.LENGTH_SHORT).show();
    }
}
