package com.nusantarian.eggshellentapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.nusantarian.eggshellentapp.R;

public class OrderMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);
        ImageView img_1 = findViewById(R.id.img_1);
        ImageView img_2 = findViewById(R.id.img_2);
        ImageView img_3 = findViewById(R.id.img_3);

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BreadActivity.class));
            }
        });
        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Please Select Another Product", Toast.LENGTH_LONG).show();
            }
        });
        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Please Select Another Product", Toast.LENGTH_LONG).show();
            }
        });
    }
}
