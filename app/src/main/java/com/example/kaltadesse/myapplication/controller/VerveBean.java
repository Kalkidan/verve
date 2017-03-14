package com.example.kaltadesse.myapplication.controller;

import com.example.kaltadesse.myapplication.utils.ReflectionUtils;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This BEAN class will be responsible for returning new instances of the model that is passed to it.
 *
 * For initiating the models, we will use method of reflection in java
 *
 * We will put in a light usage of reflection in java for this BEAN implementation.
 *
 * for more info:
 *
 * <a herf = https://docs.oracle.com/javase/tutorial/reflect/member/ctorInstance.html></a>
 *
 */

public abstract class VerveBean<MODEL> {

    /**
     *
     * Memory value of any model that is passed from the any controller
     *
     */
    private MODEL mModel;

    /**
     *
     * This method will be called by the the sub-classes in order to get the particular
     * model they are manipulating to this class.
     *
     */
    public MODEL getModel() {
        return mModel;
    }

    /**
     *
     * This method will be inherited by the subclasses of this class in order for them
     * to be able to give the class name of the model they are working on. This subclasses
     * are implementations of the contracts that are defined and will override this method
     * in order to return the model type they will be manipulating.
     *
     */
    public abstract  Class<MODEL>  modelType();

    /**
     *
     * This will be used to construct the model at first run
     *
     */
     MODEL onConstructModel() {
         return mModel = intiateModel();
     }

    /**
     *
     * This will initiate the specific model that is needed by the controller
     *
     */
    public MODEL intiateModel() {

        /**
         *
         * Get the model type
         *
         */
        Class<MODEL> modelType = modelType();

        if(modelType == null) {

            /**
             *
             * This is just a check but by no means it should
             * hit this block and let the model return to be a null
             *
             */
            return null;
        } else {
            try{
                /**
                 *
                 * Return the new model instance
                 *
                 */
                return new ReflectionUtils.newObjectByType<>(modelType).newInstance();
            } catch (Exception e) {

                throw new RuntimeException("Initiation failed.");
            }
        }
    }
}
