package com.triphunt.sparrow.sample;


import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
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
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

public class LoginFragment extends Fragment {

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
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
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
    }


    private void homeFragment(Profile profile) {

        if (profile != null) {
            Bundle mBundle = new Bundle();
            mBundle.putParcelable(PARCEL_KEY, profile);
            HomeFragment hf = new HomeFragment();
            GoogleActivity gf = new GoogleActivity();

            hf.setArguments(mBundle);

        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        final TextView tv = (TextView) view.findViewById(R.id.editText);
        final Animation an4 = AnimationUtils.loadAnimation(this.getActivity(), R.anim.translate);
        final TextView tv1 = (TextView) view.findViewById(R.id.textView3);
        final TextView tv2 = (TextView) view.findViewById(R.id.textView2);
        final LoginButton lb = (LoginButton) view.findViewById(R.id.login_button);
        final SignInButton lb1 = (SignInButton) view.findViewById(R.id.sign_in_button);

        Typeface customFont = Typeface.createFromAsset(getContext().getAssets(), "fonts/Pacifico.ttf");
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
                                 }


        );
        return view ;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loginButton = (LoginButton) view.findViewById(R.id.login_button);
        loginButton.setReadPermissions("user_friends");
        // If using in a fragment
        loginButton.setFragment(this);
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
    public void click_google(View view) {
        String response = "You are going to google activity";

        Toast.makeText(getActivity(),  response, Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this.getActivity(), GoogleActivity.class);
        getActivity().startActivity(i);


    }
}
