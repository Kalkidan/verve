package com.example.kaltadesse.myapplication.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.kaltadesse.myapplication.R;
import com.example.kaltadesse.myapplication.SampleItem;
import com.example.kaltadesse.myapplication.VerveLandingActivity;
import com.example.kaltadesse.myapplication.controller.LandingPageController;
import com.example.kaltadesse.myapplication.databinding.HeaderItemBinding;
import com.example.kaltadesse.myapplication.databinding.SampleItemBinding;
import com.example.kaltadesse.myapplication.listeners.ItemListeners;
import com.example.kaltadesse.myapplication.model.ui.LandingPageHeaderModel;
import com.example.kaltadesse.myapplication.model.ui.LandingPageItemModel;
import com.example.kaltadesse.myapplication.utils.Constants;

import javax.inject.Inject;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This will be the landing page adapter for the
 * verve sdk integration
 */

public class LandingPageAdapter extends CommonGridAdapter implements ItemListeners {

    /**
     *
     *
     * Inject the controller so we can use its components for detaching
     * the data logic from the UI logic
     */
    @Inject LandingPageController  mLandingPageController;

    private VerveLandingActivity mVerveLandingActivity;

    public LandingPageAdapter(VerveLandingActivity verveLandingActivity) {
        super();
        /**
         *
         * Get a reference to the activity so we can use its resources as needed
         */
        mVerveLandingActivity = verveLandingActivity;

        /**
         *
         * Inject this class so we can use the dagger instance of the controller
         */
        verveLandingActivity.getLandingActivityComponent().inject(this);
    }

    /**
     *
     * This will bind the headers we need for the list
     */
    @Override
    public void bindHeader(RecyclerView.ViewHolder holder, int position) {


        /**
         *
         * Cast this to the holder
         * This is the way that will eliminate most of the redundancies we face when inflating
         * the views and make the {@link RecyclerView} more efficient.
         */
        DataBoundViewHolder<HeaderItemBinding>  headerItemBindingDataBoundViewHolder =
                (DataBoundViewHolder<HeaderItemBinding>) holder;

        /**
         *
         * Construct the Ui model for each of the headers
         */
        LandingPageHeaderModel  landingPageHeaderModel = new LandingPageHeaderModel();

        /**
         *
         * Set the {@link String} on the model
         */

        landingPageHeaderModel.setName(getSampleItem(position));

        /**
         *
         * Set the model on the binding
         */
        headerItemBindingDataBoundViewHolder.binding.setHeader(landingPageHeaderModel);

        /**
         * Evaluates the pending bindings, updating any Views that have expressions bound to
         * modified variables. This <b>must</b> be run on the UI thread.
         */
        headerItemBindingDataBoundViewHolder.binding.executePendingBindings();


    }

    @Override
    public void bindItem(RecyclerView.ViewHolder holder, int position) {

        /**
         *
         * Cast this to the holder
         * This is the way that will eliminate most of the redundancies we face when inflating
         * the views and make the {@link RecyclerView} more efficient.
         */
        DataBoundViewHolder<SampleItemBinding>  sampleItemBindingDataBoundViewHolder =
                (DataBoundViewHolder<SampleItemBinding>) holder;

        /**
         *
         * Construct the Ui model for each of the headers
         */
        LandingPageItemModel landingPageItemModel = new LandingPageItemModel();

        /**
         *
         * Set the {@link String} on the model
         */

        landingPageItemModel.setName(getSampleItem(position));

        /**
         *
         * Set the {@link Integer} current position so
         * we will track the click events on the sample item on
         * the list.
         */
        landingPageItemModel.setCurrentPosition(position);

        /**
         *
         * Set the model on the binding
         */
        sampleItemBindingDataBoundViewHolder.binding.setItem(landingPageItemModel);

        /**
         *
         * Set the callback so we can listen to the clicks
         */
        sampleItemBindingDataBoundViewHolder.binding.setCallback(this);

        /**
         * Evaluates the pending bindings, updating any Views that have expressions bound to
         * modified variables. This <b>must</b> be run on the UI thread.
         */
        sampleItemBindingDataBoundViewHolder.binding.executePendingBindings();
    }

    /**
     * @param position
     * This will return the name for the given position
     *
     */
    private String  getSampleItem(int position) {
        return mLandingPageController.getDataItems(mVerveLandingActivity).get(position).getName();
    }

    /**
     *
     * This will return the total number of items we need
     * @return {@link Integer}
     */
    @Override
    public int getItemCountForDisplay() {
        return mLandingPageController.getDataItems(mVerveLandingActivity).size();
    }

    /**
     * @param position this will return if the position is a header or not
     *
     */
    @Override
    public boolean isHeader(int position) {
        return mLandingPageController.getDataItems(mVerveLandingActivity).get(position).getTarget() == null;
    }


    /**
     * @param landingPageItemModel
     *
     * This will give us access to the click events
     *
     */
    @Override
    public void onSampleItemClick(LandingPageItemModel landingPageItemModel) {

        Intent intent = new Intent(mVerveLandingActivity, mLandingPageController.
                getDataItems(mVerveLandingActivity).
                get(landingPageItemModel.getCurrentPosition()).
                getTarget());
        mVerveLandingActivity.startActivity(intent);
    }
}
