package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button button_zero;
    private Button button_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_zero = (Button) findViewById(R.id.button_zero);
        button_count = (Button) findViewById(R.id.button_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        button_zero.setBackgroundResource(R.color.colorAccent);
        view.setBackgroundResource(R.color.colorGreenLime);
    }

    public void showToast(View view) {
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, R.string.toast_button_toast, duration);
        toast.show();
    }

    public void zeroButton(View view){
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        view.setBackgroundResource(R.color.colorGray);
        button_count.setBackgroundResource(R.color.colorPrimary);
    }
}
