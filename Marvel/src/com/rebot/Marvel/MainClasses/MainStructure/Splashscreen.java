package com.rebot.Marvel.MainClasses.MainStructure;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.rebot.Marvel.MainClasses.MainStructure.MainDrawer;
import com.rebot.Marvel.R;

/**
 * Created by brounie on 13/02/14.
 */
public class Splashscreen extends SherlockActivity {
    /**
     * Called when the activity is first created.
     */

    private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 2000; // Tiempo del Splash

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.splashscreen);

        Handler handler = new Handler();

        // run a thread after 2 seconds to start the home screen
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                // make sure we close the splash screen so the user won't come back when it presses back key

                finish();

                if (!mIsBackButtonPressed) {
                    // start the home screen if the back button wasn't pressed already
                    //Intent intent = new Intent(SplashScreen.this, Main.class);

                    Intent intent = new Intent(Splashscreen.this, MainDrawer.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP |
                            Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    //finish();
                    Splashscreen.this.startActivity(intent);


                }

            }

        }, SPLASH_DURATION);
    }
}
