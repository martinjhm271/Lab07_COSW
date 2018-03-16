package com.example.martin.calculatorlab07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tempResult=new ArrayList<>();
    TextView t= null;
    TextView t2=null;
    private double tempCalculated=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.t= findViewById(R.id.textView);
        this.t2=findViewById(R.id.textView2);

        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("9");
                setTempResult(getTempResult());
            }
        });

        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("8");
                setTempResult(getTempResult());
            }
        });

        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("7");
                setTempResult(getTempResult());
            }
        });

        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("6");
                setTempResult(getTempResult());
            }
        });

        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("5");
                setTempResult(getTempResult());
            }
        });

        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("4");
                setTempResult(getTempResult());
            }
        });

        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("3");
                setTempResult(getTempResult());
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("2");
                setTempResult(getTempResult());
            }
        });

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("1");
                setTempResult(getTempResult());
            }
        });

        final Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("0");
                setTempResult(getTempResult());
            }
        });

        final Button buttonDiv = findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("/");
                setTempResult(getTempResult());
            }
        });

        final Button buttonMulti = findViewById(R.id.buttonMulti);
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("*");
                setTempResult(getTempResult());
            }
        });

        final Button buttonSustract = findViewById(R.id.buttonSustract);
        buttonSustract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("-");
                setTempResult(getTempResult());
            }
        });

        final Button buttonPoint = findViewById(R.id.buttonPoint);
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add(".");
                setTempResult(getTempResult());
            }
        });

        final Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("+");
                setTempResult(getTempResult());
            }
        });

        final Button buttonPD = findViewById(R.id.buttonPD);
        buttonPD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add(")");
                setTempResult(getTempResult());
            }
        });

        final Button buttonPI = findViewById(R.id.buttonPI);
        buttonPI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("(");
                setTempResult(getTempResult());
            }
        });

        final Button buttonSin = findViewById(R.id.buttonSin);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("sin(");
                setTempResult(getTempResult());
            }
        });

        final Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("cos(");
                setTempResult(getTempResult());
            }
        });

        final Button buttonTan = findViewById(R.id.buttonTan);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("tan(");
                setTempResult(getTempResult());
            }
        });

        final Button buttonAC = findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult=new ArrayList<>();
                tempCalculated=0;
                t.setText("0");
                t2.setText("0");
            }
        });


        final Button buttonExp = findViewById(R.id.buttonExp);
        buttonExp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("^");
                setTempResult(getTempResult());
            }
        });

        final Button buttonLog = findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tempResult.add("log(");
                setTempResult(getTempResult());
            }
        });

        final Button buttonDelete = findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(tempResult.size()>0){
                    tempResult.remove(tempResult.size()-1);
                    setTempResult(getTempResult());
                }

            }
        });



        final Button buttonEqual = findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String exp=getTempResult();
                tempCalculated=calculate(exp);
                tempResult=new ArrayList<>();
                tempResult.add(String.valueOf(tempCalculated));
                t.setText(String.valueOf("Ans"));
                t2.setText(String.valueOf(String.valueOf(tempCalculated)));
            }
        });

    }


    public double calculate(String exp){
        double result=0;
        try{
            Expression e = new ExpressionBuilder(exp+" + ( x + y )").variables("x", "y").build().setVariable("x", 0).setVariable("y", 0);
            result = e.evaluate();
        }catch (Exception e){}
        return result;
    }


    public String getTempResult(){
        String exp="";
        for(int i=0;i<tempResult.size();i++){exp+=tempResult.get(i);}
        return exp;
    }

    public void setTempResult(String ans){
        t.setText(String.valueOf(ans));
    }




}
