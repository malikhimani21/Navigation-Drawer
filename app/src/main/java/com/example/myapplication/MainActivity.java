package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DefaultFragment defaultFragment = new DefaultFragment();
        FragmentManager fragmentManager5 = getSupportFragmentManager();
        fragmentManager5.beginTransaction().replace(R.id.content_main_layout_file, defaultFragment, defaultFragment.getTag()).commit();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Toast.makeText(getApplicationContext(), "This is Navigation Drawer Activity", Toast.LENGTH_LONG).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
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

        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(getApplicationContext(), "Call", Toast.LENGTH_LONG).show();
                break;

            case R.id.email:
                Toast.makeText(getApplicationContext(), "Email", Toast.LENGTH_LONG).show();
                break;

            case R.id.sms:
                Toast.makeText(getApplicationContext(), "SMS", Toast.LENGTH_LONG).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        switch (item.getItemId()) {
            case R.id.nav_html:
                Toast.makeText(getApplicationContext(), "HTML", Toast.LENGTH_LONG).show();

                HTMLFragment htmlFragment = new HTMLFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_main_layout_file, htmlFragment, htmlFragment.getTag()).commit();

                break;

            case R.id.nav_css:
                Toast.makeText(getApplicationContext(), "CSS", Toast.LENGTH_LONG).show();

                CSSFragment cssFragment = new CSSFragment();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.content_main_layout_file, cssFragment, cssFragment.getTag()).commit();


                break;

            case R.id.nav_android:
                Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();

                AndroidFragment androidFragment = new AndroidFragment();
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                fragmentManager2.beginTransaction().replace(R.id.content_main_layout_file, androidFragment, androidFragment.getTag()).commit();


                break;

            case R.id.nav_java:
                Toast.makeText(getApplicationContext(), "JAVA", Toast.LENGTH_LONG).show();

                JavaFragment javaFragment = new JavaFragment();
                FragmentManager fragmentManager3 = getSupportFragmentManager();
                fragmentManager3.beginTransaction().replace(R.id.content_main_layout_file, javaFragment, javaFragment.getTag()).commit();


                break;

            case R.id.nav_setting:
                Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_LONG).show();

                SettingFragment settingFragment = new SettingFragment();
                FragmentManager fragmentManager4 = getSupportFragmentManager();
                fragmentManager4.beginTransaction().replace(R.id.content_main_layout_file, settingFragment, settingFragment.getTag()).commit();


                break;
        }

//        int id = item.getItemId();
//
//        if (id == R.id.nav_html) {
//            // Handle the camera action
//        } else if (id == R.id.nav_css) {
//
//        } else if (id == R.id.nav_android) {
//
//        } else if (id == R.id.nav_java) {
//
//        } else if (id == R.id.nav_setting) {
//
//        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
