package com.example.uicontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtResult=findViewById(R.id.Result);
        EditText edName=findViewById(R.id.edname);
        Button btn=findViewById(R.id.btnRegister);
        RadioButton rdMale,rdFemale;    //declaration
        Spinner spCity=findViewById(R.id.spCity);

        rdMale = findViewById(R.id.rdMale);     //initializa
        rdFemale=findViewById(R.id.rdFemale);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edName.getText().toString();
                String gender="";
                if(rdMale.isChecked())
                {
                    gender="Male";
                }else if(rdFemale.isChecked())
                {
                    gender="Female";
                }
                String city=spCity.getSelectedItem().toString();
                txtResult.setText("Welcome "+name+"\nGender: "+gender+"\nCity : "+city);
//                Toast.makeText(MainActivity2.this, "Welcome "+name, Toast.LENGTH_LONG).show();
            }
        });

    }
}