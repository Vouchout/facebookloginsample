package com.facebookloginsample.Activity.SpashScreen;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.facebookloginsample.Activity.LoginAndSignup.LoginAndSignupActivity;
import com.facebookloginsample.R;
import com.facebookloginsample.Util.Constant;
import com.facebookloginsample.databinding.ActivitySplashBinding;


public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                        startActivity(new Intent(SplashActivity.this, LoginAndSignupActivity.class));
                        finish();

            }
        }, Constant.SPLASH_TIME_OUT);
    }
}
