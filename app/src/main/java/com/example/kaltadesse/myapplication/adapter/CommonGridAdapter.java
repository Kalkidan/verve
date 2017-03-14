package com.example.kaltadesse.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.kaltadesse.myapplication.R;
import com.example.kaltadesse.myapplication.utils.Constants;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will serve as a common grid adapter within the application
 *
 * This can be extended but for now it will only hold and differentiate
 * wether a given position is a header or not.
 */

public abstract class CommonGridAdapter extends RecyclerView.Adapter{


    /**
     *
     * This will bind the header
     *
     */
    public abstract void bindHeader();

    /**
     *
     * This will bind the item
     *
     */
    public abstract void bindItem();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == Constants.HEADER) {

            /**
             *
             * Return a header item if it is the first element in the list we get back
             *
             */
            return DataBoundViewHolder.create(parent, R.layout.header_item);
        }

        /**
         *
         * Return a sample item if it is not the first element in the list
         *
         */
        return DataBoundViewHolder.create(parent, R.layout.sample_item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(position == Constants.HEADER) {

            /**
             *
             * Bind the header for this adapter
             */
            bindHeader();
        } else {

            /**
             *
             * Bind the item for this adapter
             */
            bindItem();
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    private boolean isHeader() { return true; }
}
