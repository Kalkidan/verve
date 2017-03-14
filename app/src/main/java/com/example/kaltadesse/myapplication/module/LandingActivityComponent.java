package com.example.kaltadesse.myapplication.module;

import dagger.Subcomponent;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is the dagger component that will have
 * the classes injected to it and can provide
 * downstream components
 */

@Subcomponent (modules = {LandingActivityModule.class})
public interface LandingActivityComponent {
}
