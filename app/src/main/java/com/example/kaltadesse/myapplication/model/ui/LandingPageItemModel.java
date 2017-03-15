package com.example.kaltadesse.myapplication.model.ui;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is a Ui model for the landing page item
 */

public class LandingPageItemModel extends BaseObservable{


    @Bindable private String itemName;

    @Bindable private int currentPosition;

    public int getCurrentPosition() {
        return currentPosition;
    }

    /**
     * @param currentPosition
     *
     * the current position on the adapter just when the
     * click happens
     *
     */
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;

        /**
         *
         *
         * This will propagate the changes on the UI to the system
         * and let the UI know about it.
         */
        notifyPropertyChanged(BR.currentPosition);
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;

        /**
         *
         *
         * This will propagate the changes on the UI to the system
         * and let the UI know about it.
         */
        notifyPropertyChanged(BR.itemName);
    }
}
