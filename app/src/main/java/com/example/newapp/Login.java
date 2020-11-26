package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends AppCompatActivity implements View.OnClickListener{
    ImageView image;
    EditText account;
    EditText password;
    Button login;
    Button forget;
    Button creation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        image=(ImageView)findViewById(R.id.image_one);
        account=(EditText)findViewById(R.id.account);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        forget=(Button)findViewById(R.id.forget_password);
        creation=(Button)findViewById(R.id.new_creation);
        login.setOnClickListener(this);
        forget.setOnClickListener(this);
        creation.setOnClickListener(this);


    }

    @Override

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                setLogin(view);
                break;
            case R.id.forget_password:
                setForget(view);
                break;
            case R.id.new_creation:
                setCreation(view);
                break;
            default:
                break;
        }
    }
    public void setLogin(View view) {
        Intent intent =  new Intent(Login.this, Communicate.class);
        startActivity(intent);
    }
    public void setForget(View view) {
        Intent intent =  new Intent(Login.this, Log_forget_password.class);
        startActivity(intent);
    }
    public void setCreation(View view) {
        Intent intent =  new Intent(Login.this, Log_account_creation.class);
        startActivity(intent);
    }
}