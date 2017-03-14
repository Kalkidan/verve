package com.example.kaltadesse.myapplication;

import android.app.LauncherActivity;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will be the sample item that we will be using to load the
 * list view
 */

public class SampleItem extends LauncherActivity.ListItem{

    private Class target;
    private String name;

    public SampleItem(String name) {
        this.name = name;
    }

    public SampleItem(Class target, String name) {
        this.target = target;
        this.name = name;
    }

    public Class getTarget() {
        return target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
