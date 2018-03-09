package com.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
AppCompatButton mAppCompatButton;
AppCompatButton mLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAppCompatButton=(AppCompatButton)findViewById(R.id.not_a_member_signup_button);
        mAppCompatButton.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
                                                }
                                            });
            mLoginButton=(AppCompatButton)findViewById(R.id.login_button);
            mLoginButton.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
            });
        }
    }



