package com.nusantarian.eggshellentapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nusantarian.eggshellentapp.activity.OrderMenuActivity;
import com.nusantarian.eggshellentapp.R;

import java.util.Objects;


public class OrderFragment extends Fragment{

    public OrderFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_order, container, false);
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        CardView cv_order = view.findViewById(R.id.cv_order);
        ((AppCompatActivity) Objects.requireNonNull(getActivity())).setSupportActionBar(toolbar);

        cv_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), OrderMenuActivity.class));
            }
        });

        return view;
    }
}
