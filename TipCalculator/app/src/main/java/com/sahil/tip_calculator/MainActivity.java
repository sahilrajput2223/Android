package com.sahil.tip_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText tip;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        amount = findViewById(R.id.amount);
        tip = findViewById(R.id.tip);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
    }

    public void calculate(View view) {

        int Amount = Integer.parseInt(amount.getText().toString());
        int Tip = Integer.parseInt(tip.getText().toString());

        int sum = Amount + Tip ;

        String Answer1 = "Total Amount is: " + sum;
        String Answer2 = "And, Tip Amount is: " + Tip;

        text1.setText(Answer1);
        text2.setText(Answer2);

    }
}
