package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String test = "",test_2 = "",value_1 = "", value_2 = "";
    boolean add=false, sub=false, div=false, mul=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button back_button = (Button) findViewById(R.id.back);


        back_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }

        });

    }


    public void on_click(View view)
    {
        TextView sonuc = (TextView) findViewById(R.id.sonuc_c);

        if(view.getId() == R.id.zero)
        {
            if(value_1.equals("")) {
                test = test + "0";
                sonuc.setText(test);
            }
            else
            {
                test = test + "0";
                value_2 = value_2 + "0";
                sonuc.setText(test);
            }
        }
        else if (view.getId() == R.id.one)
        {
            if(value_1.equals("")) {
                test = test + "1";
                sonuc.setText(test);
            }
            else
            {
                test = test + "1";
                value_2 = value_2 + "1";
                sonuc.setText(test);
            }
        }
        else if (view.getId() == R.id.two)
        {
            if(value_1.equals("")) {
                test = test + "2";
                sonuc.setText(test);
            }
            else
            {
                test = test + "2";
                value_2 = value_2 + "2";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.three)
        {
            if(value_1.equals("")) {
                test = test + "3";
                sonuc.setText(test);
            }
            else
            {
                test = test + "3";
                value_2 = value_2 + "3";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.four)
        {
            if(value_1.equals("")) {
                test = test + "4";
                sonuc.setText(test);
            }
            else
            {
                test = test + "4";
                value_2 = value_2 + "4";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.five)
        {
            if(value_1.equals("")) {
                test = test + "5";
                sonuc.setText(test);
            }
            else
            {
                test = test + "5";
                value_2 = value_2 + "5";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.six)
        {
            if(value_1.equals("")) {
                test = test + "6";
                sonuc.setText(test);
            }
            else
            {
                test = test + "6";
                value_2 = value_2 + "6";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.seven)
        {
            if(value_1.equals("")) {
                test = test + "7";
                sonuc.setText(test);
            }
            else
            {
                test = test + "7";
                value_2 = value_2 + "7";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.eight)
        {
            if(value_1.equals("")) {
                test = test + "8";
                sonuc.setText(test);
            }
            else
            {
                test = test + "8";
                value_2 = value_2 + "8";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.nine)
        {
            if(value_1.equals("")) {
                test = test + "9";
                sonuc.setText(test);
            }
            else
            {
                test = test + "9";
                value_2 = value_2 + "9";
                sonuc.setText(test);
            }
        }
        else if(view.getId() == R.id.clear)
        {
            div = false;
            add = false;
            sub = false;
            mul = false;
            test = "";
            value_1 = "";
            value_2 = "";
            sonuc.setText(test);
        }
        else if(view.getId() == R.id.div)
        {
            div = true;
            add = false;
            sub = false;
            mul = false;
            if(value_1.equals(""))
                value_1 = test;
            else
                value_2 = "";
            test = test + "/";
            sonuc.setText(test);
        }
        else if(view.getId() == R.id.sub)
        {
            div = false;
            add = false;
            sub = true;
            mul = false;
            if(value_1.equals(""))
                value_1 = test;
            else
                value_2 = "";
            test = test + "-";
            sonuc.setText(test);
        }
        else if(view.getId() == R.id.sum)
        {
            div = false;
            add = true;
            sub = false;
            mul = false;
            if(value_1.equals(""))
                value_1 = test;
            else
                value_2 = "";
            test = test + "+";
            sonuc.setText(test);
        }
        else if(view.getId() == R.id.multi)
        {
            div = false;
            add = false;
            sub = false;
            mul = true;
            if(value_1.equals(""))
                value_1 = test;
            else
                value_2 = "";
            test = test + "*";
            sonuc.setText(test);
        }
        else if(view.getId() == R.id.esittir)
        {
            float val_1,val_2;
            val_1 = Float.parseFloat(value_1);
            val_2 = Float.parseFloat(value_2);
            if(div == true) {
                test = test + "= " + String.valueOf(val_1/val_2);
                sonuc.setText(test);
            }
            else if(add == true)
            {
                test = test + "= "+ String.valueOf(val_1+val_2);
                sonuc.setText(test);
            }
            else if(sub == true)
            {
                test = test + "= "+ String.valueOf(val_1-val_2);
                sonuc.setText(test);
            }
            else if(mul == true)
            {
                test = test + "= "+ String.valueOf(val_1*val_2);
                sonuc.setText(test);
            }
            test = "";
        }
    }
}



