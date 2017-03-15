package com.example.kaltadesse.myapplication.listeners;

import com.example.kaltadesse.myapplication.model.ui.LandingPageItemModel;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is an interface that will be used to listen to the
 * click events on the UI
 */

public interface ItemListeners {

    /**
     *
     * @param landingPageItemModel
     * This will listen to the item clicks on the list view
     */
    public void onSampleItemClick(LandingPageItemModel landingPageItemModel);
}
