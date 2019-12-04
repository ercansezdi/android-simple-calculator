package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.text.InputType;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText editPassword = (EditText) findViewById(R.id.passwd);

        CheckBox checkBox = (CheckBox) findViewById(R.id.hide_passwd);
        Button login = (Button) findViewById(R.id.login_button_x);

        editPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    editPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    editPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (editPassword.getText().toString().equals("admin") && username.getText().toString().equals("admin"))
                {
                    Toast toast  = Toast.makeText(getApplicationContext(),"new page",Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                }
                else
                {
                    Toast toast  = Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                }
            }
        });
    }

}
