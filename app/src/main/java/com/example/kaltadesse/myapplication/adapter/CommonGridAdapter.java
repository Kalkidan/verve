package com.example.kaltadesse.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.kaltadesse.myapplication.R;
import com.example.kaltadesse.myapplication.SampleItem;
import com.example.kaltadesse.myapplication.VerveLandingActivity;
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
     * @param position
     * @param holder
     *
     */
    public abstract void bindHeader(RecyclerView.ViewHolder holder, int position);

    /**
     *
     * This will bind the item
     * @param position
     * @param holder
     *
     */
    public abstract void bindItem(RecyclerView.ViewHolder holder, int position);

    /**
     *
     * This will be extended with in the subclasses to show
     * the item counts.
     */

    public abstract int getItemCountForDisplay();


    /**
     *
     * Check if this is a header or not
     */

    public abstract boolean isHeader(int position);

    public CommonGridAdapter() {}

    private int mCurrentPosition;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        /**
         *
         * Return the header if so or return item.
         */
        return   viewType == Constants.HEADER ? DataBoundViewHolder.create(parent, R.layout.header_item) :
                    DataBoundViewHolder.create(parent, R.layout.sample_item);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(isHeader(position)) {

            /**
             *
             * Bind the header for this adapter
             */
            bindHeader(holder, position);
        } else {

            /**
             *
             * Bind the item for this adapter
             */
            bindItem(holder, position);
        }
    }

    @Override
    public int getItemCount() {
        return getItemCountForDisplay();
    }

    /**
     * @param position this will identify which one is a header and
     *                 which one is an item
     *
     */
    @Override
    public int getItemViewType(int position) {

        if(isHeader(position)) {
            return Constants.HEADER;
        }
        return Constants.ITEM;
    }
}
