package com.example.infobyte.Activity;

import static com.example.infobyte.R.id.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.infobyte.NavFragments.DashboardFragment;
import com.example.infobyte.NavFragments.ProfileFragment;
import com.example.infobyte.NavFragments.UserFragment;
import com.example.infobyte.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class UI_Main_Page extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomnav;
    RelativeLayout relavtiveLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_main_page);

        bottomnav = findViewById(R.id.bottomnav);
        relavtiveLayout = findViewById(R.id.relavtiveLayout);

        bottomnav.setOnNavigationItemSelectedListener(this);
        loadFragmnet(new DashboardFragment());

    }

    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        if (item.getItemId() == R.id.dashboard) {
            fragment = getSupportFragmentManager().findFragmentByTag(DashboardFragment.class.getSimpleName());
            if (fragment == null) {
                fragment = new DashboardFragment();
            }
        }
        else if(item.getItemId()==R.id.user)
        {
            fragment = getSupportFragmentManager().findFragmentByTag(UserFragment.class.getSimpleName());
            if (fragment == null) {
                fragment = new UserFragment();
            }
        }
        else if (item.getItemId()==R.id.profile)
        {
            fragment = getSupportFragmentManager().findFragmentByTag(ProfileFragment.class.getSimpleName());
            if (fragment == null) {
                fragment = new ProfileFragment();
            }
        }

        if (fragment != null) {
            loadFragmnet(fragment);
            return true;
        }

        //First Commit Chnages test for branch

        //Second Change in same branch

        return true;
    }



    void loadFragmnet(Fragment fragment){
        //To attach Fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.relavtiveLayout,fragment).commit();
    }
}