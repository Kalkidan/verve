package com.example.kaltadesse.myapplication.module;

import com.example.kaltadesse.myapplication.VerveLandingActivity;
import com.example.kaltadesse.myapplication.controller.LandingPageController;
import com.example.kaltadesse.myapplication.controller.LandingPageControllerImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is the module used to carry the instances of the
 * injected class there by providing the dependency injection
 */

@Module
public class LandingActivityModule {

    private VerveLandingActivity mVerveLandingActivity;

    public LandingActivityModule(VerveLandingActivity verveLandingActivity) {

        /**
         *
         * If we need the context of the {@link VerveLandingActivity}
         * for any of our constructor injections we will use this context
         *
         */
        mVerveLandingActivity = verveLandingActivity;
    }

    /**
     *
     * This will be providing the new instance needs of our dependency injection
     *
     */
    @Provides
    @LandingActivityScope
    public LandingPageController  getLandingPageController() {
        return new LandingPageControllerImpl();
    }

}
