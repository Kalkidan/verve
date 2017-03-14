package com.example.kaltadesse.myapplication.utils;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * A reflection util class that will be used to return the business logic
 * model instance
 */

public class ReflectionUtils {

    /**
     * Inner static class in order to initiate them
     */
    public static class newObjectByType<T>{
        /**
         * Generic class that represents any data-model at any time
         */
        private Class<T> c;

        /**
         * A constructor that parametrize a generic class that represents any MODEL
         * passed as a data
         */
        public newObjectByType(Class<T> clasz){
            c = clasz;
        }

        /**
         *<p>
         *     As it is know to us there are two major types of reflection in java
         *     <t>
         *         @see java.lang.reflect.Constructor#newInstance(Object...)  AND
         *         @see Class#newInstance()
         *
         *         for more info:
         *
         *         <a herf = https://docs.oracle.com/javase/tutorial/reflect/member/ctorInstance.html></a>
         *
         *     </t>
         *</p>
         *
         */
        public T newInstance() throws IllegalAccessException, InstantiationException {
            return c.newInstance();
        }
    }
}
