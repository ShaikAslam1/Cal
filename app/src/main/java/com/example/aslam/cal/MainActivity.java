package com.example.aslam.cal;

import android.app.Fragment;
import android.printservice.PrintJob;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd,btnSubtract,btnMultiply,btnDivide,btnModulo;
    private TextView tvResult;
    private EditText firstNumber,secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubstract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnModulo = (Button) findViewById(R.id.btnModulo);
        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        tvResult = (TextView) findViewById(R.id.textView3);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = firstNumber.getText().toString();
        String num2 = secondNumber.getText().toString();
        switch (v.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvResult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubstract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvResult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvResult.setText(String.valueOf(multiplication));
                break;
            case R.id.btnDivide:
                try{
                    double division = Double.parseDouble(num1) / Double.parseDouble(num2);
                    tvResult.setText(String.valueOf(division));
                }
                catch (Exception e){
                    tvResult.setText("Can't Divide");
                }
                break;
            case R.id.btnModulo:
                int Modulo = Integer.parseInt(num1) % Integer.parseInt(num2);
                tvResult.setText(String.valueOf(Modulo));
        }

    }
}