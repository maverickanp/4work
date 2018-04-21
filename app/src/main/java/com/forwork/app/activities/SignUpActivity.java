package com.forwork.app.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.forwork.app.R;


public class SignUpActivity extends AppCompatActivity {

    //@BindView(R.id.tvw_signin) TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //ButterKnife.bind(this);

    }
}