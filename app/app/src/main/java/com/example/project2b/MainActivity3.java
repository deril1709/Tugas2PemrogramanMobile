package com.example.project2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void act4(View view) {
        Intent c = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(c);
        Toast.makeText(this, "Activity", Toast.LENGTH_SHORT).show();
    }
}