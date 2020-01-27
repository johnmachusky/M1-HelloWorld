package com.example.johnhelloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//Import what is necessary for toast to work
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a Toast that says the Hello World Application has started
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"The Hello World Application Has Started",Toast.LENGTH_LONG).show();


    }
}