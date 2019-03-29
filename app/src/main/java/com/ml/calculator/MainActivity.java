package com.ml.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView calc;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMult,btnDivide,btnDot,btnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0.findViewById(R.id.zero);
        btn1.findViewById(R.id.one);
        btn2.findViewById(R.id.two);
        btn3.findViewById(R.id.three);
        btn4.findViewById(R.id.four);
        btn5.findViewById(R.id.five);
        btn6.findViewById(R.id.six);
        btn7.findViewById(R.id.seven);
        btn8.findViewById(R.id.eight);
        btn9.findViewById(R.id.nine);
        btnPlus.findViewById(R.id.plus);
        btnMinus.findViewById(R.id.minus);
        btnMult.findViewById(R.id.mult);
        btnDivide.findViewById(R.id.divide);
        btnDot.findViewById(R.id.dot);

    }
}
