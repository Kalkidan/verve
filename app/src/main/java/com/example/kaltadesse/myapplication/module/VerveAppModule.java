package com.example.kaltadesse.myapplication.module;

import com.example.kaltadesse.myapplication.VerveApplication;

import dagger.Module;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will carry the new instances of the injected
 * classes for global use
 */

@Module
public class VerveAppModule {

    private VerveApplication mVerveApplication;

    public VerveAppModule(VerveApplication verveApplication) {
        mVerveApplication =  verveApplication;
    }
}
