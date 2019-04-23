package com.nusantarian.eggshellentapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.nusantarian.eggshellentapp.R;
import com.nusantarian.eggshellentapp.activity.LoginActivity;

import java.util.Objects;

public class ProfileFragment extends Fragment {

    private FirebaseAuth mAuth;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        Button btn_signout = view.findViewById(R.id.btn_signout);
        mAuth = FirebaseAuth.getInstance();

        btn_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(getActivity(), LoginActivity.class));
                Objects.requireNonNull(getActivity()).finish();
            }
        });

        return view;
    }

}
