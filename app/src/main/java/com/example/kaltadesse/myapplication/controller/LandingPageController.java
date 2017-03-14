package com.example.kaltadesse.myapplication.controller;

import android.app.Activity;

import com.example.kaltadesse.myapplication.SampleItem;
import com.example.kaltadesse.myapplication.model.data.LandingPageModel;

import java.util.List;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will define a contract that will provide business logic
 * data for our UI elements for the landing page
 */

public interface LandingPageController extends BaseController<LandingPageModel>{

    /**
     *
     * This will provide the data needed to load the items.
     *
     * Just pretend for now that we are getting this from the
     * back end.
     *
     */
    public List<SampleItem> getDataItems(Activity context);
}
