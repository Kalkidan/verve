package com.example.kaltadesse.myapplication.controller;

/**
 *
 *
 * Created by kaltadesse on 3/14/17.
 *
 * This will define a base contract for the rest of the controllers
 * we will have for this project.
 *
 */

public interface BaseController<MODEL> {

    /**
     *
     * A generic model that will be used for the data logic we will
     * be building for each of the individual controllers
     */
    MODEL getModel();

    /**
     *
     * @see BaseControllerImpl#getModel() will be responsible for mainly constructing the new instance
     * of the model under manuiplation but this method will be called for getting the instance of the model
     *
     * If we are running the model for the first time then we will call the {@link VerveBean} for
     * initiating the model and if we call it subsquently after that we will use this method to
     * get the instance.
     *
     */
    public  MODEL getInstance();
}
