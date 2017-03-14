package com.example.kaltadesse.myapplication.adapter;

import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;

/**
 * Created by kaltadesse on 3/14/17.
/**
 * An Adapter implementation that works with a {@link DataBoundViewHolder}.
 * <p>
 * Although this version enforces a single item type, it can easily be extended to support multiple
 * view types.
 *
 * @param <T> The type of the binding class
 */
abstract public class DataBoundAdapter<T extends ViewDataBinding> extends
        BaseDataBoundAdapter<T> {

    @LayoutRes
    private final int mLayoutId;

    /**
     * Creates a DataBoundAdapter with the given item layout
     *
     * @param layoutId The layout to be used for items. It must use data binding.
     */
    public DataBoundAdapter(@LayoutRes int layoutId) {
        mLayoutId = layoutId;
    }

    @Override
    public int getItemLayoutId(int position) {
        return mLayoutId;
    }
}
