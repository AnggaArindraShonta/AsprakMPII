package com.example.asprakmpll.RoomDatabase.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.asprakmpll.Fragment.HomeFragment;
import com.example.asprakmpll.Fragment.MainFragment;
import com.example.asprakmpll.R;
import com.google.android.material.navigation.NavigationBarView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeActivity extends AppCompatActivity {

    private Fragment fragment = null;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ChipNavigationBar chipNavigationBar = findViewById(R.id.bottomBar);

        chipNavigationBar.setItemSelected(R.id.nav_home, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        chipNavigationBar.setOnItemSelectedListener(i -> {
            switch (i) {
                case R.id.nav_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.nav_main:
                    fragment = new MainFragment();
                    break;
            }

            if (fragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            }
        });
    }
}