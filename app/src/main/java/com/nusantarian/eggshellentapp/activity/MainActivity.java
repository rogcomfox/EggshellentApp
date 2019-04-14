package com.nusantarian.eggshellentapp.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nusantarian.eggshellentapp.R;
import com.nusantarian.eggshellentapp.fragment.HomeFragment;
import com.nusantarian.eggshellentapp.fragment.OrderFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("EggshellentApp");
        setSupportActionBar(toolbar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               Fragment selectedFragment = null;
               switch (menuItem.getItemId()){
                   case R.id.icon_home:
                       selectedFragment = new HomeFragment();
                       break;
                   case R.id.icon_order:
                       selectedFragment = new OrderFragment();
                       break;
               }
               if (selectedFragment != null) {
                   getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFragment).commit();
               }
               return true;
           }
        });
    }
}
