package com.example.project2b;

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

    public void act2(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "Halaman Berita", Toast.LENGTH_SHORT).show();
    }

    public void act3(View view) {
        Intent b = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(b);
        Toast.makeText(this, "Halaman Biodata", Toast.LENGTH_SHORT).show();

    }

}
