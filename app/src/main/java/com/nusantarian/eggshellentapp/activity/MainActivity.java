package com.nusantarian.eggshellentapp.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nusantarian.eggshellentapp.R;
import com.nusantarian.eggshellentapp.fragment.HomeFragment;
import com.nusantarian.eggshellentapp.fragment.OrderFragment;
import com.nusantarian.eggshellentapp.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    final Fragment fragment1 = new HomeFragment();
    final Fragment fragment2 = new OrderFragment();
    final Fragment fragment3 = new ProfileFragment();
    final FragmentManager fm =getSupportFragmentManager();
    Fragment active = fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm.beginTransaction().add(R.id.main_frame, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_frame, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_frame,fragment1, "1").commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.icon_home:
                        fm.beginTransaction().hide(active).show(fragment1).commit();
                        active = fragment1;
                        return true;
                    case R.id.icon_order:
                        fm.beginTransaction().hide(active).show(fragment2).commit();
                        active = fragment2;
                        return true;
                    case R.id.icon_profil:
                        fm.beginTransaction().hide(active).show(fragment3).commit();
                        active = fragment3;
                        return true;
                }
                return false;
            }
        });
    }
}
