package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void login(View view){
        EditText editText3=(EditText)findViewById(R.id.editText3);
        EditText editText4=(EditText)findViewById(R.id.editText4);
        String username =editText3.getText().toString();
        String password= editText4.getText().toString();
        if(username.equals("hackerearth")&&password.equals("124Y!")){
            Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this,HOME.class);
            openhome();
        }
        else{
            Toast.makeText(this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();
        }
    }
    public void forgot(View view){
        Toast.makeText(this,"Contact your team lead",Toast.LENGTH_SHORT).show();
    }
    public void openhome(){
        Intent intent = new Intent(this,HOME.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
