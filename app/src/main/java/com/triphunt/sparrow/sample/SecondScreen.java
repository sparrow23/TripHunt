package com.triphunt.sparrow.sample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;


public class SecondScreen extends AppCompatActivity{
    private CallbackManager callbackManager = null;
    private AccessTokenTracker mtracker = null;
    private ProfileTracker mprofileTracker = null;
    public static final String PARCEL_KEY = "parcel_key";
    private LoginButton loginButton;

    FacebookCallback<LoginResult> callback = new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {

            Profile profile = Profile.getCurrentProfile();
            homeFragment(profile);
        }

        @Override
        public void onCancel() {

        }

        @Override
        public void onError(FacebookException error) {

        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());

        setContentView(R.layout.second_layout);
        //AccessToken accessToken = AccessToken.getCurrentAccessToken();

        callbackManager = CallbackManager.Factory.create();
        mtracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {

                Log.v("AccessTokenTracker", "oldAccessToken=" + oldAccessToken + "||" + "CurrentAccessToken" + currentAccessToken);
            }
        };

        mprofileTracker = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(Profile oldProfile, Profile currentProfile) {

                Log.v("Session Tracker", "oldProfile=" + oldProfile + "||" + "currentProfile" + currentProfile);
                homeFragment(currentProfile);

            }
        };

        mtracker.startTracking();
        mprofileTracker.startTracking();

        final TextView tv = (TextView) findViewById(R.id.editText);
        final Animation an4 = AnimationUtils.loadAnimation(this, R.anim.translate);
        final TextView tv1 = (TextView) findViewById(R.id.textView3);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final LoginButton lb = (LoginButton) findViewById(R.id.login_button);
        final SignInButton lb1 = (SignInButton) findViewById(R.id.sign_in_button);

        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        tv.setTypeface(customFont);
        tv.startAnimation(an4);

        an4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //tv.startAnimation(an2);
                lb.setVisibility(View.VISIBLE);
                lb1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("user_friends");
        loginButton.registerCallback(callbackManager, callback);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onStop() {
        super.onStop();
        mtracker.stopTracking();
        mprofileTracker.stopTracking();
    }

    public boolean isLoggedIn() {
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        return accessToken != null;
    }

    @Override
    public void onResume() {
        super.onResume();

        if (isLoggedIn()) {
            loginButton.setVisibility(View.INVISIBLE);
            Profile profile = Profile.getCurrentProfile();
            homeFragment(profile);

        }

    }

    private void homeFragment(Profile profile) {

        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

    public void click_continue(View view) {
        String response = "ok you are continuing";
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();

        Intent getNameScreenIntent = new Intent(this, MainActivity.class);
        startActivity(getNameScreenIntent);


    }
}
