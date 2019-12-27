package com.application157.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        // set text inside  textview to message
        TextView textview = findViewById(R.id.orderText);
        textview.setText(message);
    }

}
