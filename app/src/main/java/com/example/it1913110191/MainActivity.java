package com.example.it1913110191;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnplu, btnneg, btnmul, btndiv;
    TextView showresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnplu = findViewById(R.id.btnplu);
        btnneg = findViewById(R.id.btnneg);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        showresult = findViewById(R.id.showresult);

        btnplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().toString().equals("")){
                    num1.setError("Please input number");
                } else if (num2.getText().toString().equals("")) {
                    num2.setError("Please input number");
                } else {
                    int x = Integer.parseInt(num1.getText().toString());
                    int y = Integer.parseInt(num1.getText().toString());
                    showresult.setText("Result = " + (x + y));
                }
            }
        });
        btnneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().toString().equals("")){
                    num1.setError("Please input number");
                } else if (num2.getText().toString().equals("")) {
                    num2.setError("Please input number");
                } else {
                    int x = Integer.parseInt(num1.getText().toString());
                    int y = Integer.parseInt(num1.getText().toString());
                    showresult.setText("Result = " + (x - y));
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().toString().equals("")){
                    num1.setError("Please input number");
                } else if (num2.getText().toString().equals("")) {
                    num2.setError("Please input number");
                } else {
                    int x = Integer.parseInt(num1.getText().toString());
                    int y = Integer.parseInt(num1.getText().toString());
                    showresult.setText("Result = " + (x * y));
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().toString().equals("")){
                    num1.setError("Please input number");
                } else if (num2.getText().toString().equals("")) {
                    num2.setError("Please input number");
                } else {
                    int x = Integer.parseInt(num1.getText().toString());
                    int y = Integer.parseInt(num1.getText().toString());
                    showresult.setText("Result = " + (x / y));
                }
            }
        });
    }
}