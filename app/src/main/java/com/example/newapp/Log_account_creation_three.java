package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_account_creation_three extends AppCompatActivity {
    Button back;
    TextView confirmation;
    EditText confirmation_one;
    EditText confirmation_two;
    Button confirmation_end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_account_creation_three);
        back=(Button)findViewById(R.id.back_password);
        confirmation=(TextView)findViewById(R.id.confirmation);
        confirmation_one=(EditText)findViewById(R.id.confirmation_one);
        confirmation_two=(EditText)findViewById(R.id.confirmation_two);
        confirmation_end=(Button)findViewById(R.id.get_confirmation_end);
    }
}