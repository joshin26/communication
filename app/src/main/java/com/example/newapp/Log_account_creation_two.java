package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_account_creation_two extends AppCompatActivity implements View.OnClickListener{
    Button back_ceartion;
    TextView password;
    EditText password_one;
    EditText password_two;
    Button next_confirmation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_account_creation_two);
        back_ceartion=(Button)findViewById(R.id.back_creation);
        password=(TextView)findViewById(R.id.password_setting);
        password_one=(EditText)findViewById(R.id.password_one);
        password_two=(EditText)findViewById(R.id.password_two);
        next_confirmation=(Button)findViewById(R.id.next_confirmation);
        back_ceartion.setOnClickListener(this);
        next_confirmation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_creation:
                setBackCreation(view);
                break;
            case R.id.next_confirmation:
                setNextConfirmation(view);
                break;
            default:
                break;
        }
    }
    public void setBackCreation(View view) {
        Intent intent =  new Intent(Log_account_creation_two.this,Communicate.class);
        startActivity(intent);
    }
    public void setNextConfirmation(View view) {
        Intent intent =  new Intent(Log_account_creation_two.this, Log_account_creation_three.class);
        startActivity(intent);
    }
}