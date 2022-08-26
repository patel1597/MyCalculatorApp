package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText value1;
    private EditText value2;
    private EditText value3;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button mod;
    private Button square;
    private Button clear;
    private EditText totalValue;
    // I used this website to find out how to round to three decimal places: https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
    private final DecimalFormat threeDecimalPlaces = new DecimalFormat("0.000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = (EditText) findViewById(R.id.value1);
        value2 = (EditText) findViewById(R.id.value2);
        value3 = (EditText) findViewById(R.id.value3);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        mod = (Button) findViewById(R.id.mod);
        square = (Button) findViewById(R.id.square);
        clear = (Button) findViewById(R.id.clear);
        totalValue = (EditText) findViewById(R.id.totalResult);
    }

    public void findSum(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        if (!v1.equals("") || !v2.equals("")) {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);

            double total = n1 + n2;

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void findDifference(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        if (!v1.equals("") || !v2.equals("")) {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);

            double total = n1 - n2;

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void findProduct(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        if (!v1.equals("") || !v2.equals("")) {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);

            double total = n1 * n2;

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void findQuotient(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        if (!v1.equals("") || !v2.equals("")) {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);

            double total = n1 / n2;

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void findModulus(View view){
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        if (!v1.equals("") || !v2.equals("")) {
            double n1 = Double.parseDouble(v1);
            double n2 = Double.parseDouble(v2);

            double total = n1 % n2;

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void square(View view) {
        String v3 = value3.getText().toString();

        if (!v3.equals("")) {
            double n1 = Double.parseDouble(v3);

            double total = Math.pow(n1, 2);

            totalValue.setText("" + threeDecimalPlaces.format(total));
        }
    }

    public void clear(View view){
        value1.setText("");
        value2.setText("");
        value3.setText("");
        totalValue.setText("0.000");
    }
}