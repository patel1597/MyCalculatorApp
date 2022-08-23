package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText value1;
    private EditText value2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private EditText totalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = (EditText) findViewById(R.id.value1);
        value2 = (EditText) findViewById(R.id.value2);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        totalValue = (EditText) findViewById(R.id.totalResult);
    }

    public void add(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double total = n1 + n2;

        totalValue.setText(Double.toString(total));
    }

    public void subtract(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double total = n1 - n2;

        totalValue.setText(Double.toString(total));
    }

    public void multiply(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double total = n1 * n2;

        totalValue.setText(Double.toString(total));
    }

    public void divide(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double total = n1 / n2;

        totalValue.setText(Double.toString(total));
    }
}