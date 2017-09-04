package com.triphunt.sparrow.sample;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.Profile;
import com.facebook.login.*;
import com.facebook.login.LoginFragment;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public final static String TAG_FRAGMENT = "TAG_FRAGMENT";
    public ImageView profile_pic = null;
    public Profile profile = null;
    public TextView profile_name = null;
    public TextView email_id = null;
    public static int navItemIndex = 0;
    private String[] activityTitles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       /* try {
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }catch(NullPointerException n)
        {
            System.out.print("unable to find value");
        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        profile_pic = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.profile);
        profile_name = (TextView) navigationView.getHeaderView(0).findViewById(R.id.profile_name);
        email_id = (TextView) navigationView.getHeaderView(0).findViewById(R.id.email_id);

        profile = Profile.getCurrentProfile();
        profile_name.setText(profile.getName());
        email_id.setText(profile.getId());

        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);




        //profile_pic=  (ImageView) findViewById(R.id.profile);
        //profile = Profile.getCurrentProfile();
        Picasso.with(this)
                .load(profile.getProfilePictureUri(160, 160).toString())
               .into(profile_pic);

        Fragment fragment = new MainContent();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.frame, fragment, "main");
        fragmentTransaction.commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }

        FragmentManager fragmentManager = getFragmentManager();
        PlaceDetails myFragment =(PlaceDetails) getSupportFragmentManager().findFragmentByTag("placeDetails");
        PlaceInfo myFragment1 =(PlaceInfo) getSupportFragmentManager().findFragmentByTag("placeInfo");
        Hotels myFragment2 =(Hotels) getSupportFragmentManager().findFragmentByTag("hotels");
        VisitPlace myFragment3 =(VisitPlace) getSupportFragmentManager().findFragmentByTag("visitPlace");
        Malls myFragment4 =(Malls) getSupportFragmentManager().findFragmentByTag("malls");
        Multiplexes myFragment5 =(Multiplexes) getSupportFragmentManager().findFragmentByTag("multiplexes");
        RegionalFood myFragment6 =(RegionalFood) getSupportFragmentManager().findFragmentByTag("regionalFood");
        MainContent myFragment7 =(MainContent) getSupportFragmentManager().findFragmentByTag("main");

        if (myFragment != null && myFragment.isVisible()) {
            // add your code here
           super.onBackPressed();

        }

       else if (myFragment1 != null && myFragment1.isVisible()) {
            // add your code here
             super.onBackPressed();

        }
        else if (myFragment2 != null && myFragment2.isVisible()) {
            // add your code here
            super.onBackPressed();

        }
        else if (myFragment3 != null && myFragment3.isVisible()) {
            // add your code here
            super.onBackPressed();

        }
        else if (myFragment4 != null && myFragment4.isVisible()) {
            // add your code here
            super.onBackPressed();

        }
        else if (myFragment5 != null && myFragment5.isVisible()) {
            // add your code here
            super.onBackPressed();

        }

        else if (myFragment6 != null && myFragment6.isVisible()) {
            // add your code here
            super.onBackPressed();

        }
        else if (myFragment7 != null && myFragment7.isVisible()) {
            // add your code here
            super.onBackPressed();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Fragment fragment = new MainContent();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                    android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.frame, fragment, "New Tour");
            fragmentTransaction.commitAllowingStateLoss();



        } else if (id == R.id.nav_gallery) {
            Fragment fragment = new SelectedPlaces();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                    android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.frame, fragment, fragment.getTag());
            fragmentTransaction.commitAllowingStateLoss();
        } else if (id == R.id.nav_slideshow) {

            Fragment fragment = new OldTour();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                    android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.frame, fragment, fragment.getTag());
            fragmentTransaction.commitAllowingStateLoss();
        } else if (id == R.id.nav_manage) {
            Fragment fragment = new CancelTour();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                    android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.frame, fragment, fragment.getTag());
            fragmentTransaction.commitAllowingStateLoss();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.applozic.mobicomkit.sample");
            if (launchIntent != null) {
                startActivity(launchIntent);//null pointer check in case package name was not found
            }



        } else if (id == R.id.weather_info) {
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.sparrow.weatherapp");
            if (launchIntent != null) {
                startActivity(launchIntent);//null pointer check in case package name was not found
            }

        } else if(id == R.id.logout) {

            LoginManager.getInstance().logOut();
            Fragment fragment = new LoginFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                    android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.frame, fragment, fragment.getTag());
            fragmentTransaction.commitAllowingStateLoss();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
   /* private void setToolbarTitle() {
        getSupportActionBar().setTitle(activityTitles[navItemIndex]);
    }*/

}


