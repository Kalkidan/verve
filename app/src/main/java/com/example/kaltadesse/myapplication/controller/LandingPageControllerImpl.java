package com.example.kaltadesse.myapplication.controller;

import android.app.Activity;

import com.example.kaltadesse.myapplication.R;
import com.example.kaltadesse.myapplication.SampleItem;
import com.example.kaltadesse.myapplication.appnexus.AppNexusBannerSample;
import com.example.kaltadesse.myapplication.appnexus.AppNexusInterstitialSample;
import com.example.kaltadesse.myapplication.appnexus.AppNexusRectangleSample;
import com.example.kaltadesse.myapplication.dfp.DfpBannerSample;
import com.example.kaltadesse.myapplication.dfp.DfpInterstitialSample;
import com.example.kaltadesse.myapplication.dfp.DfpRectangleSample;
import com.example.kaltadesse.myapplication.model.data.LandingPageModel;
import com.example.kaltadesse.myapplication.mopub.MoPubBannerSample;
import com.example.kaltadesse.myapplication.mopub.MoPubInterstitialSample;
import com.example.kaltadesse.myapplication.mopub.MoPubRectangleSample;
import com.example.kaltadesse.myapplication.verve.VerveRectangleSample;
import com.example.kaltadesse.myapplication.verve.VerveSample;
import com.example.kaltadesse.myapplication.verve.VerveSplashManagerSample;

import java.util.ArrayList;
import java.util.List;

import static com.appnexus.opensdk.utils.Clog.getString;

/**
 * Created by kaltadesse on 3/14/17.
 *
 * This is implementation of the {@link LandingPageController}
 */

public class LandingPageControllerImpl extends BaseControllerImpl<LandingPageModel> implements LandingPageController{

    @Override
    public Class<LandingPageModel> modelType() {
        return LandingPageModel.class;
    }

    @Override
    public List<SampleItem> getDataItems(Activity context) {

        List<SampleItem> items = new ArrayList<>();
        // Verve
        items.add(new SampleItem(context.getString(R.string.verve)));
        items.add(new SampleItem(VerveSample.class, context.getString(R.string.verve_sdk_samples)));
        items.add(new SampleItem(VerveSplashManagerSample.class, context.getString(R.string.splash_manager_sample)));
        items.add(new SampleItem(VerveRectangleSample.class, context.getString(R.string.verve_inline_sample)));
        // Dfp
        items.add(new SampleItem(context.getString(R.string.dfp)));
        items.add(new SampleItem(DfpBannerSample.class, context.getString(R.string.dfp_banner_sample)));
        items.add(new SampleItem(DfpRectangleSample.class, context.getString(R.string.dfp_rectangle_sample)));
        items.add(new SampleItem(DfpInterstitialSample.class, context.getString(R.string.dfp_interstitial_sample)));
        // MoPub
        items.add(new SampleItem(context.getString(R.string.mopub)));
        items.add(new SampleItem(MoPubBannerSample.class, context.getString(R.string.mopub_banner_sample)));
        items.add(new SampleItem(MoPubRectangleSample.class, context.getString(R.string.mopub_rectangle_sample)));
        items.add(new SampleItem(MoPubInterstitialSample.class, context.getString(R.string.mopub_interstitial_sample)));
        // AppNexus
        items.add(new SampleItem(context.getString(R.string.appnexus)));
        items.add(new SampleItem(AppNexusBannerSample.class, context.getString(R.string.appnexus_banner_sample)));
        items.add(new SampleItem(AppNexusRectangleSample.class, context.getString(R.string.appnexus_rectangle_sample)));
        items.add(new SampleItem(AppNexusInterstitialSample.class, context.getString(R.string.appnexus_interstitial_sample)));

        return items;
    }


}
