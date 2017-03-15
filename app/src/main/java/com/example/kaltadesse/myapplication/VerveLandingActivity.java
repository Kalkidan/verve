package com.example.kaltadesse.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.kaltadesse.myapplication.adapter.LandingPageAdapter;
import com.example.kaltadesse.myapplication.databinding.ActivityMainBinding;
import com.example.kaltadesse.myapplication.module.LandingActivityComponent;
import com.example.kaltadesse.myapplication.module.LandingActivityModule;
import com.example.kaltadesse.myapplication.module.VerveAppComponent;

public class VerveLandingActivity extends BaseActivity {

    private LandingActivityComponent mLandingActivityComponent;

    @Override
    public void setContentView() {

        /**
         *
         * Get the {@link ActivityMainBinding} to inflate the view
         *
         */
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        LandingPageAdapter  landingPageAdapter = new LandingPageAdapter(this);
        activityMainBinding.recyclerView.setAdapter(landingPageAdapter);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void injectDependencies() {
        if(mLandingActivityComponent == null) {

            /**
             *
             * This will prepare the landing activity component for us to use it for our
             * dependency injection needs
             */
            mLandingActivityComponent = ((VerveApplication) this.getApplication()).
                    getVerveAppComponent().
                    newLandingActivityComponent(new LandingActivityModule(this));
        }
    }

    public LandingActivityComponent getLandingActivityComponent() { return mLandingActivityComponent; }

}
