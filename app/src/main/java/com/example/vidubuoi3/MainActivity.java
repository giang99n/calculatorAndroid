package com.example.vidubuoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView kq;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btn0, add, mul, div, sub, btnC, btnCE, btnBS, enter, btn;
    Double var1;
    Double var2;
    Double ans; int var;
    Boolean addition = false, subtract = false, multiply = false, divide = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kq = findViewById(R.id.text);
        btn0 = findViewById(R.id.bt0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        add = findViewById(R.id.btncong);
        sub = findViewById(R.id.btntru);
        mul = findViewById(R.id.btnnhan);
        div = findViewById(R.id.btnchia);
        btnC = findViewById(R.id.btnC);
        btnCE = findViewById(R.id.btnCE);
        enter = findViewById(R.id.btnEqual);
        btnBS = findViewById(R.id.btnBS);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kq.getText().toString().contains("-")){
                    kq.setText(kq.getText().toString().substring(1));
                }else kq.setText("-"+kq.getText().toString());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "0");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "1");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "1");
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "2");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "3");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "4");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "5");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "6");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "7");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "8");var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + "9");
                    var=0;
                }else {
                    var = 0;
                    kq.setText(kq.getText() + "9");
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var==1){
                    kq.setText("");
                    kq.setText(kq.getText() + ".");
                }
                var=0;
                if(kq.getText().toString().contains(".")) {
                    //
                }else
                    kq.setText(kq.getText() + ".");
            }
        });

        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kq.setText(kq.getText().toString().substring(0,kq.getText().toString().length()-1));
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(kq.getText().toString());

                if (addition) {
                    ans = var1 + var2;
                } else if (subtract) {
                    ans = var1 - var2;
                } else if (multiply) {
                    ans = var1 * var2;
                } else if (divide) {
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
                bFalse();
                kq.setText(ans.toString());
                var =1;


            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition==true||multiply==true|| divide==true||subtract==true){
                    bFalse();
                    addition = true;
                }else {
                    var1 = Double.parseDouble(kq.getText().toString());
                    kq.setText("");
                    bFalse();
                    addition = true;
                    //
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition==true||multiply==true|| divide==true||subtract==true){
                    bFalse();
                    subtract = true;
                }else {
                    var1 = Double.parseDouble(kq.getText().toString());
                    kq.setText("");
                    bFalse();
                    subtract = true;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition==true||multiply==true|| divide==true||subtract==true){
                    bFalse();
                    divide = true;
                }else {
                    var1 = Double.parseDouble(kq.getText().toString());
                    kq.setText("");
                    bFalse();
                    divide = true;
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition==true||multiply==true|| divide==true||subtract==true){
                    bFalse();
                    multiply = true;
                }else {
                    var1 = Double.parseDouble(kq.getText().toString());
                    kq.setText("");
                    bFalse();
                    multiply = true;
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kq.setText("");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kq.setText("");
                var1 = 0.0;
                var2 = 0.0;
            }
        });






    }

    public void bFalse(){
        addition =false;
        subtract = false;
        divide = false;
        multiply=false;

    }
}