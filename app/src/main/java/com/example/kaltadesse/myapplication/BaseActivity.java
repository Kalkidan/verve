package com.example.kaltadesse.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is the base run activity that will be running for each activity that will be
 * extending it and will carry the common functionalities needed by the subclasses of this
 * class
 */

public abstract class BaseActivity extends AppCompatActivity {

    /**
     *
     * This will set the content view of the desired subclass
     *
     */
    public abstract void setContentView();


    /**
     *
     * This will inject the dependencies for the desired subclass
     *
     */
    public abstract void injectDependencies();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         *
         * Inject dependencies
         */
        injectDependencies();

        /**
         *
         * This will set up the content view for the subclasses
         */
        setContentView();


    }
}
