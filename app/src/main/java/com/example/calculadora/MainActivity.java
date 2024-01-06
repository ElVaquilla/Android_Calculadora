package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int res; // Resultado de la operación
    int op; // Flag para saber que operación se realiza
                // 0 --> No hay operación a realizar
                // 1 --> Suma
                // 2 --> Resta
                // 3 --> Multiplicación
                // 4 --> División
    String op1; // Primer operando
    String op2; // Segundo operando
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op = 0;
    }
    EditText editText = (EditText)findViewById(R.id.resultado);
    public void btn0onClick(View v){
        if(op==0) {
            op1.concat("0");
            editText.setText(op1);
        }else {
            op2.concat("0");
            editText.setText(op2);
        }
    }

    public void btn1onClick(View v) {
        if (op == 0) {
            op1.concat("1");
            editText.setText(op1);
        } else {
            op2.concat("1");
            editText.setText(op2);
        }
    }
    public void btn2onClick(View v){
        if(op==0) {
            op1.concat("2");
            editText.setText(op1);
        }else{
            op2.concat("2");
            editText.setText(op2);
        }
    }
    public void btn3onClick(View v){
        if(op==0) {
            op1.concat("3");
            editText.setText(op1);
        }else{
            op2.concat("3");
            editText.setText(op2);
        }
    }

    public void btn4onClick(View v){
        if(op==0) {
            op1.concat("4");
            editText.setText(op1);
        }else{
            op2.concat("4");
            editText.setText(op2);
        }
    }
    public void btn5onClick(View v){
        if(op==0) {
            op1.concat("5");
            editText.setText(op1);
        }else{
            op2.concat("5");
            editText.setText(op2);
        }
    }

    public void btn6onClick(View v){
        if(op==0) {
            op1.concat("6");
            editText.setText(op1);
        }else{
            op2.concat("6");
            editText.setText(op2);
        }
    }
    public void btn7onClick(View v){
        if(op==0) {
            op1.concat("7");
            editText.setText(op1);
        }else{
            op2.concat("7");
            editText.setText(op2);
        }
    }
    public void btn8onClick(View v){
        if(op==0) {
            op1.concat("8");
            editText.setText(op1);
        }else{
            op2.concat("8");
            editText.setText(op2);
        }
    }
    public void btn9onClick(View v){
        if(op==0) {
            op1.concat("9");
            editText.setText(op1);
        }else{
            op2.concat("9");
            editText.setText(op2);
        }
    }
    public void divonClick(View v){op = 4;editText.setText("/");}
    public void multonClick(View v){op = 3;editText.setText("X");}
    public void restonClick(View v){op = 2;editText.setText("-");}
    public void sumonClick(View v){op = 1;editText.setText("+");}
    public void eqonClick(View v){
        if(op == 1){
            res = Integer.parseInt(op1) + Integer.parseInt(op2);
        }
        if(op == 2){
            res = Integer.parseInt(op1) - Integer.parseInt(op2);
        }
        if(op == 3){
            res = Integer.parseInt(op1) * Integer.parseInt(op2);
        }
        if(op == 4){
            res  = Integer.parseInt(op1) / Integer.parseInt(op2);
        }
        editText.setText(res);
    }
}