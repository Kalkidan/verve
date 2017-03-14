package com.example.kaltadesse.myapplication.module;

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
}
