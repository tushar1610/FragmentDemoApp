package com.example.android.fragmentdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button changeBtn;
    private int btn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeBtn = findViewById(R.id.change_btn);
        btn_count = 0;
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_count++;
                Log.d("Button count", String.valueOf(btn_count));
                callFragment(btn_count);
            }
        });
    }

    private void callFragment(int pass_variable) {
        Bundle bundle = new Bundle();
        bundle.putInt("button count", pass_variable);
        Log.d("Bundle count", String.valueOf(btn_count));
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.slide_in,  // enter
                        R.anim.fade_out   // exit
                )
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, Fragment_one.class, bundle)
                .addToBackStack(String.valueOf(pass_variable))
                .commit();
    }
}