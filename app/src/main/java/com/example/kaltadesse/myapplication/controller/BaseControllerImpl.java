package com.example.kaltadesse.myapplication.controller;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is the implementation of the contracts within the {@link BaseController} class
 */

public abstract class BaseControllerImpl<MODEL> extends VerveBean<MODEL> implements BaseController<MODEL>{

    /**
     *
     * After the first run for getting the business logic model to
     * get the model this will be used for returning the already
     * existing business logic model
     *
     */
    @Override
    public MODEL getModel() {
        return super.getModel();
    }

    @Override
    public MODEL getInstance() {
        /**
         *
         * If the model is null then inquire the {@link AndroidBean} to make us one using
         * the {@link #getModel()} model for it to construct and give us the model we inquire.
         *
         */
        if(getModel() == null) {

            /**
             *
             * Construct the new model for us since we
             *
             */
            return onConstructModel();

        } else {

            /**
             *
             * If there is a model in the memory then fetch that;
             *
             */
            return super.getModel();
        }
    }
}
