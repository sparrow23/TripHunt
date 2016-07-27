package com.triphunt.sparrow.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class SecondScreen extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());

        setContentView(R.layout.second_layout);


    }
    public void click_continue(View view) {
        String response = "sorry sir we haven't worked so far!!!";
        Toast.makeText(this, response, Toast.LENGTH_LONG).show();
    }
}
