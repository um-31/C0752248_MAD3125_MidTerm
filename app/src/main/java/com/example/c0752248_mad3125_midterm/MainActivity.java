package com.example.c0752248_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private Button btnLogin;
    private EditText txtUserName;
    private EditText txtPassword;
    String userName;
    String password;
    Login detail1 = new Login("admin1@gmail.com","1234");
    Login detail2 = new Login("admin2@gmail.com","1234");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = txtUserName.getText().toString();
                password = txtPassword.getText().toString();
                login(userName,password);
            }
        });
    }
    public void getData() {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtUserName = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
    }
    public void login(String userName,String password) {

    }
}
