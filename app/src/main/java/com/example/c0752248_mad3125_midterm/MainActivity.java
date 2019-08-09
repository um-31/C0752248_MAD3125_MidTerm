package com.example.c0752248_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    int temp = 0;
    String userName;
    String password;
    String storeUsername;
    String storePassword;
    Login detail1 = new Login("admin1","1234");
    Login detail2 = new Login("admin2@gmail.com","1234");
    Login detail3 = new Login("admin3@gmail.com","1234");
    Login[] login = {detail1,detail2,detail3};

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
                if(userName.isEmpty() || userName.trim().length() == 0)
                {
                    txtUserName.setError("Enter Email ID");
                    temp++;
                }else {
                    temp = 0;
                }
                if(password.isEmpty() || password.trim().length() == 0)
                {
                    txtPassword.setError("Enter Password");
                    temp++;
                }
                else{
                    temp = 0;
                }
                if(temp == 0) {
                    login(userName,password);
                }
            }
        });
    }
    public void getData() {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtUserName = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
    }
    public void login(String userName,String password) {
        temp = 0;

        for(int i = 0;i<login.length;i++) {
            storeUsername = login[i].userName;
            storePassword = login[i].password;;

            if (userName.equals(storeUsername) && password.equals(storePassword)) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }else {
                temp++;
            }

        }
        if (temp == login.length) {
            Toast.makeText(this, "Wrong UserID or Password", Toast.LENGTH_SHORT).show();
        }
    }
}
