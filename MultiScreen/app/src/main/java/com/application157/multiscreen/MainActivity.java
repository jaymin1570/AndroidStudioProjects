package com.application157.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.application157.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){
        // we will handle the click on the button
        // Build an intent to open another activity
        Intent intent = new Intent(this,orderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);

        String message = "Order for " + editText1.getText().toString() + " , " +
                editText2.getText().toString() + " & " +
                editText3.getText().toString() + " has been successfully placed.... ";

        intent.putExtra(MSG,message);
        startActivity(intent);
    }

}
