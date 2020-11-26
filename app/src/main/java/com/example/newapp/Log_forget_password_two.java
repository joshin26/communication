package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_forget_password_two extends AppCompatActivity implements View.OnClickListener{
    Button account_confirmation;
    TextView change_password;
    EditText password_one;
    EditText password_two;
    Button change_password_end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_forget_password_two);
        account_confirmation=(Button)findViewById(R.id.back_account_confirmation);
        change_password=(TextView)findViewById(R.id.change_password);
        password_one=(EditText)findViewById(R.id.new_password_one);
        password_two=(EditText)findViewById(R.id.new_password_two);
        change_password_end=(Button)findViewById(R.id.forget_password_end);
        account_confirmation.setOnClickListener(this);
        change_password_end.setOnClickListener(this);
        account_confirmation.setOnClickListener(this);
        change_password_end.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_account_confirmation:
                setBackAccountConfirmation(view);
                break;
            case R.id.forget_password_end:
                setChangePasswordEnd(view);
                break;
            default:
                break;
        }
    }
    public void setBackAccountConfirmation(View view) {
        Intent intent =  new Intent(Log_forget_password_two.this, Log_forget_password.class);
        startActivity(intent);
    }
    public void setChangePasswordEnd(View view) {
        Intent intent =  new Intent(Log_forget_password_two.this, Login.class);
        startActivity(intent);
    }
}