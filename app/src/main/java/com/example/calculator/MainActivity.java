package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView calculate;
    private TextView result;

    private String calcHolder;

    private boolean isOperatorTriggered;
    private String operator;

    private List<String> firstHolder;
    private List<String> secondHolder;

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_dot;
    private Button btn_div;
    private Button btn_mul;
    private Button btn_sub;
    private Button btn_add;
    private Button btn_equ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calcHolder = "";
        this.isOperatorTriggered = false;
        this.firstHolder = new ArrayList<>();
        this.secondHolder = new ArrayList<>();

        findByIds();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("0");
                    calcHolder = calcHolder + "0";
                } else {
                    secondHolder.add("0");
                    calcHolder = calcHolder + "0";
                }
                displayCalc(calcHolder);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("1");
                    calcHolder = calcHolder + "1";
                } else {
                    secondHolder.add("1");
                    calcHolder = calcHolder + "1";
                }
                displayCalc(calcHolder);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("2");
                    calcHolder = calcHolder + "2";
                } else {
                    secondHolder.add("2");
                    calcHolder = calcHolder + "2";
                }
                displayCalc(calcHolder);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("3");
                    calcHolder = calcHolder + "3";
                } else {
                    secondHolder.add("3");
                    calcHolder = calcHolder + "3";
                }
                displayCalc(calcHolder);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("4");
                    calcHolder = calcHolder + "4";
                } else {
                    secondHolder.add("4");
                    calcHolder = calcHolder + "4";
                }
                displayCalc(calcHolder);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("5");
                    calcHolder = calcHolder + "5";
                } else {
                    secondHolder.add("5");
                    calcHolder = calcHolder + "5";
                }
                displayCalc(calcHolder);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("6");
                    calcHolder = calcHolder + "6";
                } else {
                    secondHolder.add("6");
                    calcHolder = calcHolder + "6";
                }
                displayCalc(calcHolder);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("7");
                    calcHolder = calcHolder + "7";
                } else {
                    secondHolder.add("7");
                    calcHolder = calcHolder + "7";
                }
                displayCalc(calcHolder);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("8");
                    calcHolder = calcHolder + "8";
                } else {
                    secondHolder.add("8");
                    calcHolder = calcHolder + "8";
                }
                displayCalc(calcHolder);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == true) {
                    firstHolder.add("9");
                    calcHolder = calcHolder + "9";
                } else {
                    secondHolder.add("9");
                    calcHolder = calcHolder + "9";
                }
                displayCalc(calcHolder);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcHolder = calcHolder + ".";
                displayCalc(calcHolder);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "/";
                    calcHolder = calcHolder + "/";
                    isOperatorTriggered = true;
                }
                displayCalc(calcHolder);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "*";
                    isOperatorTriggered = true;
                    calcHolder = calcHolder + "*";
                }
                displayCalc(calcHolder);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "-";
                    isOperatorTriggered = true;
                    calcHolder = calcHolder + "-";
                }
                displayCalc(calcHolder);
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered == false) {
                    operator = "+";
                    isOperatorTriggered = true;
                    calcHolder = calcHolder + "+";
                }
                displayCalc(calcHolder);
            }
        });

        btn_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int finalResult = calculatedResult(firstHolder, secondHolder, operator);
                displayResult(Integer.toString(finalResult));
            }
        });

    }

    private void findByIds() {
        this.calculate = (TextView) findViewById(R.id.calculate);
        this.result = (TextView) findViewById(R.id.result);
        this.btn_0 = (Button) findViewById(R.id.key_0);
        this.btn_1 = (Button) findViewById(R.id.key_1);
        this.btn_2 = (Button) findViewById(R.id.key_2);
        this.btn_3 = (Button) findViewById(R.id.key_3);
        this.btn_4 = (Button) findViewById(R.id.key_4);
        this.btn_5 = (Button) findViewById(R.id.key_5);
        this.btn_6 = (Button) findViewById(R.id.key_6);
        this.btn_7 = (Button) findViewById(R.id.key_7);
        this.btn_8 = (Button) findViewById(R.id.key_8);
        this.btn_9 = (Button) findViewById(R.id.key_9);
        this.btn_dot = (Button) findViewById(R.id.key_dot);
        this.btn_div = (Button) findViewById(R.id.key_div);
        this.btn_mul = (Button) findViewById(R.id.key_mul);
        this.btn_sub = (Button) findViewById(R.id.key_sub);
        this.btn_add = (Button) findViewById(R.id.key_add);
        this.btn_equ = (Button) findViewById(R.id.key_equ);
    }

    private void displayCalc(String number) {
        this.calculate.setText(number);
    }

    private void displayResult(String result) {
        this.result.setText(result);
    }

    private static int calculatedResult(List<String> listOne, List<String> listTwo, String operator) {
        int sumFirstHolder = 0;
        int sumSecondHolder = 0;
        int result = 0;

        for (int i = 0; i < listOne.size(); i++) {
            sumFirstHolder += Integer.parseInt(listOne.get(i));
        }

        for (int i = 0; i < listTwo.size(); i++) {
            sumSecondHolder += Integer.parseInt(listTwo.get(i));
        }

        switch (operator) {
            case "/":
                result = sumFirstHolder / sumSecondHolder;
                break;
            case "*":
                result = sumFirstHolder * sumSecondHolder;
                break;
            case "-":
                result = sumFirstHolder - sumSecondHolder;
                break;
            case "+":
                result = sumFirstHolder + sumSecondHolder;
                break;
        }
        return result;
    }
}