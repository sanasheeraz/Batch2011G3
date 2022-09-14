package com.example.uicontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demo(View obj)
    {
        //Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}