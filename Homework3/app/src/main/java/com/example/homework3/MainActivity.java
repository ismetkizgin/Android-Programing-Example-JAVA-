package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox[] checkbox = new CheckBox[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox[0] = findViewById(R.id.checkBox1);
        checkbox[1] = findViewById(R.id.checkBox2);
        checkbox[2] = findViewById(R.id.checkBox3);
        checkbox[3] = findViewById(R.id.checkBox4);
        checkbox[4] = findViewById(R.id.checkBox5);
    }

    public void showToast(View view) {
        String tostText =  "Toppings: ";
        for(int i=0; i<5; i++){
            if(checkbox[i].isChecked())
                tostText += " " + checkbox[i].getText();
        }
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, tostText, duration);
        toast.show();
    }
}
