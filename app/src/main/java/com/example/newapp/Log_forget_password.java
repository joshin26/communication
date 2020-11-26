package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_forget_password extends AppCompatActivity implements View.OnClickListener{
    Button back;
    TextView account_confirmation;
    EditText account;
    EditText confirmation;
    Button next_change_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_forget_password_one);
        back=(Button)findViewById(R.id.back_first);
        account_confirmation=(TextView)findViewById(R.id.account_confirmation);
        account=(EditText)findViewById(R.id.account);
        confirmation=(EditText)findViewById(R.id.confirmation_code);
        next_change_password=(Button)findViewById(R.id.next_change_password);
        back.setOnClickListener(this);
        next_change_password.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.back_first:
                    setBackFirst(view);
                    break;
                case R.id.next_change_password:
                    setNextChangePassword(view);
                    break;
                default:
                    break;
        }
    }
    public void setBackFirst(View view) {
        Intent intent =  new Intent(Log_forget_password.this,MainActivity.class);
        startActivity(intent);
    }
    public void setNextChangePassword(View view) {
        Intent intent =  new Intent(Log_forget_password.this, Log_forget_password_two.class);
        startActivity(intent);
    }
}