package com.example.kaltadesse.myapplication.model.ui;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is a UI model for the landing page header
 *
 * That extends {@link BaseObservable} class
 */

public class LandingPageHeaderModel extends BaseObservable{

    @Bindable private String headerName;

    public String getName() {
        return headerName;
    }

    public void setName(String name) {
        this.headerName = name;

        /**
         *
         *
         * This will propagate the changes on the UI to the system
         * and let the UI know about it.
         */
        notifyPropertyChanged(BR.headerName);
    }
}
