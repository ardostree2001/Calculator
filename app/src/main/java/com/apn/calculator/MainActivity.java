package com.apn.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bDec, bEqual, bClear, bDel;
    TextView ans, preview;
    String s;
    double var1, var2, var3;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);

        bAdd = (Button) findViewById(R.id.btnAdd);
        bSub = (Button) findViewById(R.id.btnSub);
        bMul = (Button) findViewById(R.id.btnMul);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bDec = (Button) findViewById(R.id.btnDec);
        bEqual = (Button) findViewById(R.id.btnEqual);
        bClear = (Button) findViewById(R.id.btnC);
        bDel = (Button) findViewById(R.id.btnDel);

        ans = (TextView) findViewById(R.id.Ans);
        preview = (TextView) findViewById(R.id.preview);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });

        bDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                preview.setText(var1+"+");
                add = true;
                ans.setText(null);
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                preview.setText(var1+"-");
                sub = true;
                ans.setText(null);
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                preview.setText(var1+"*");
                mul = true;
                ans.setText(null);
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                preview.setText(var1+"/");
                div = true;
                ans.setText(null);
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(ans.getText() + "");
                if (add == true) {
                    var3 = var1 + var2;
                    ans.setText(var3+"");
                    add = false;
                    preview.setText("");
                }

                if (sub == true) {
                    var3 = var1 - var2;
                    ans.setText(var3+"");
                    sub = false;
                    preview.setText("");
                }

                if (mul == true) {
                    var3 = var1 * var2;
                    ans.setText(var3+"");
                    mul = false;
                    preview.setText("");
                }

                if (div == true) {
                    var3 = var1 / var2;
                    ans.setText(var3+"");
                    div = false;
                    preview.setText("");
                }
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                preview.setText("");
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setText("");

                s=String.valueOf(ans.getText());
                ans.setText(s.substring(0,s.length()-1));
                if(s.length()==0)
                {
                    ans.setText("0");
                }
            }
        });


    }


}