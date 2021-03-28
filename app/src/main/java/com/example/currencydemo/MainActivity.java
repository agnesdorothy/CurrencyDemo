package com.example.currencydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
    }

    public void przelicz(View view){
        double eur = (int) (Integer.parseInt(editNumber.getText().toString())* 0.21);

        Toast.makeText(this, eur + " euro", Toast.LENGTH_LONG).show();


        }
    }
}