package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.mybutton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You pushed the button from on create", Toast.LENGTH_LONG).show();
            }
        });


    }
    public void push(View view){
        Toast.makeText(this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
    }
}