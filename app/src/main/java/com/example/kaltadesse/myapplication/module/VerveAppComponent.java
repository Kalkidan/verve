package com.example.kaltadesse.myapplication.module;

import com.example.kaltadesse.myapplication.VerveLandingActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will provide the app component global
 * singleton instances for the dependency injections
 */

@Singleton
@Component(modules = {VerveAppModule.class})
public interface VerveAppComponent {

    /**
     * A down stream component that is injected here with in the application context
     * and will stay for the duration of the activity so this way we will clean up our
     * memory efficiently
     *
     */
    LandingActivityComponent newLandingActivityComponent(LandingActivityModule verveLandingActivity);
}
