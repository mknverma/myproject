package com.mk.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    protected void onStart() {
        super.onStart();
        initView();
    }

    //Remove When Designing Home Page
    private void initView()
    {
        Button test_btn_login = (Button) findViewById(R.id.test_btn_login);
        test_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , LoginActivity.class));
            }
        });
        Button test_btn_sign_up = (Button) findViewById(R.id.test_btn_sign_up);
        test_btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , SignupActivity.class));
            }
        });
    }

}
