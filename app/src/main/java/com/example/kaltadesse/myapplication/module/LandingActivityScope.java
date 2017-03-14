package com.example.kaltadesse.myapplication.module;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by kaltadesse on 3/14/17.
 *
 *
 * A custom scope that will span for only specified
 * amount of the application life cycle this will span as long as the
 * activity lives or the fragment lives
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LandingActivityScope {
}
