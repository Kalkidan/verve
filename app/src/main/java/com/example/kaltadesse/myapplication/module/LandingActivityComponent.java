package com.example.kaltadesse.myapplication.module;

import com.example.kaltadesse.myapplication.adapter.LandingPageAdapter;

import dagger.Subcomponent;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is the dagger component that will have
 * the classes injected to it and can provide
 * downstream components
 */

@Subcomponent (modules = {LandingActivityModule.class})
@LandingActivityScope
public interface LandingActivityComponent {

    void inject(LandingPageAdapter landingPageAdapter);
}
