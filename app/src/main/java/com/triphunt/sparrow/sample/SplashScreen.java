package com.triphunt.sparrow.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by SPARROW on 7/21/2016.
 */
public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        final ImageView iv2 = (ImageView) findViewById(R.id.imageView);
        final Animation an1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);
        final Animation an3 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotaterev);
        final Animation an4 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.translate);
        iv2.startAnimation(an4);


        an4.setAnimationListener(new Animation.AnimationListener() {
                                     @Override
                                     public void onAnimationStart(Animation animation) {

                                     }

                                     @Override
                                     public void onAnimationEnd(Animation animation) {
                                         iv2.startAnimation(an2);
                                         finish();
                                         Intent  i = new Intent(getBaseContext(), SecondScreen.class);
                                         startActivity(i);
                                     }

                                     @Override
                                     public void onAnimationRepeat(Animation animation) {

                                     }
                                 }


        );
    }
}
