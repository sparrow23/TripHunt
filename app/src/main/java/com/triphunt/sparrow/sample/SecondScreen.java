package com.triphunt.sparrow.sample;

import android.app.Activity;
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



public class SecondScreen extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());

        setContentView(R.layout.second_layout);
        android.support.v4.app.FragmentManager fragmentManager = this.getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        LoginFragment loginFragment = new LoginFragment();

        fragmentTransaction.add(R.id.frag_container1, loginFragment) ;
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void click_continue(View view) {
        String response = "ok you are continuing";
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();

        Intent getNameScreenIntent = new Intent(this, MainActivity.class);
        startActivity(getNameScreenIntent);


    }
}
