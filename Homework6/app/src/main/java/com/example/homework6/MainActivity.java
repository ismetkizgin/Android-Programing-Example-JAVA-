package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void donutImegesClick(View v) {
       Intent i = new Intent(MainActivity.this, DonutActivity.class);
       startActivity(i);
    }

    public void froyoImegesClick(View v) {
        Intent i = new Intent(MainActivity.this, FroyoActivity.class);
        startActivity(i);
    }

    public void icecreamImegesClick(View v) {
        Intent i = new Intent(MainActivity.this, IcecreamActivity.class);
        startActivity(i);
    }
}
