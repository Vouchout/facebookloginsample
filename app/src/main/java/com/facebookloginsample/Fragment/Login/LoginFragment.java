package com.facebookloginsample.Fragment.Login;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;
import com.facebookloginsample.Fragment.Login.View.LoginFragmentView;
import com.facebookloginsample.R;
import com.facebookloginsample.databinding.FragmentLoginBinding;


import java.util.Arrays;


public class LoginFragment extends Fragment  {

    private FragmentLoginBinding binding;

    private ProgressDialog progressDialog;
    private LoginButton loginButton;
    private CallbackManager callbackManager;

    private int RC_SIGN_IN = 100;
    private String id, name;

    public LoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        View view = binding.getRoot();



        loginButton = (LoginButton) view.findViewById(R.id.login_button);

        callbackManager = CallbackManager.Factory.create();
        loginButton.setReadPermissions(Arrays.asList("public_profile, email, user_birthday"));

        binding.rlFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                facebooklogin();
            }
        });


        binding.rlLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        return view;
    }


    public void login() {
        if (binding.userNameET.getText().toString().equals("")) {
            Toast.makeText(getActivity().getApplicationContext(), "Please enter username", Toast.LENGTH_SHORT).show();
        } else if (binding.passwordET.getText().toString().equals("")) {
            Toast.makeText(getActivity().getApplicationContext(), "Please enter password", Toast.LENGTH_SHORT).show();
        } else {

        }
    }



    public void facebooklogin() {
        loginButton.performClick();
    }










}
