package com.example.kaltadesse.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.kaltadesse.myapplication.adapter.LandingPageAdapter;
import com.example.kaltadesse.myapplication.databinding.ActivityMainBinding;

public class VerveLandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        LandingPageAdapter  landingPageAdapter = new LandingPageAdapter();
        activityMainBinding.recyclerView.setAdapter(landingPageAdapter);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
