package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_account_creation extends AppCompatActivity implements View.OnClickListener {
    Button back_first;
    TextView creation;
    EditText account_one;
    EditText account_two;
    Button next_password_setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_account_creation_one);
        back_first=(Button)findViewById(R.id.back);
        creation=(TextView)findViewById(R.id.new_creation);
        account_one=(EditText)findViewById(R.id.account);
        account_two=(EditText)findViewById(R.id.account_confirmation);
        next_password_setting=(Button)findViewById(R.id.next_password);
        back_first.setOnClickListener(this);
        next_password_setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                setBackFirst(view);
                break;
            case R.id.forget_password:
                setCreation(view);
                break;
            default:
                break;
        }
    }
    public void setBackFirst(View view) {
        Intent intent =  new Intent(Log_account_creation.this, Login.class);
        startActivity(intent);
    }
    public void setCreation(View view) {
        Intent intent =  new Intent(Log_account_creation.this, Log_account_creation_two.class);
        startActivity(intent);
    }
}