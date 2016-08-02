package com.triphunt.sparrow.sample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;



public class SecondScreen extends AppCompatActivity {

   // public LoginFragment loginFragment = new LoginFragment();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());

        setContentView(R.layout.second_layout);

    }

    public void click_continue(View view) {
        String response = "sorry sir we haven't worked so far!!!";
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
    }
}
