package com.example.android.fragmentdemoapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_one extends Fragment {

    TextView btn_count;

    public Fragment_one() {
        super(R.layout.fragment_one);
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        int someInt = getArguments().getInt("button count");
        btn_count = view.findViewById(R.id.text_view_fragment);
        Toast.makeText(getContext(), "button click " + someInt, Toast.LENGTH_SHORT).show();
        btn_count.setText("Button count : " + someInt);

    }
}