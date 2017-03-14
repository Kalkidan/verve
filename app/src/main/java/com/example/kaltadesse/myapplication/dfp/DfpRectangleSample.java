package com.example.kaltadesse.myapplication.dfp;


import android.widget.RelativeLayout;

import com.example.kaltadesse.myapplication.R;
import com.google.android.gms.ads.AdSize;

/**
 * This class shows how to insert a DFP Rectangle into your application.
 */
public class DfpRectangleSample extends DfpBannerSample {

	public DfpRectangleSample() {
		title = R.string.dfp_rectangle_sample;
		adAlignment = RelativeLayout.CENTER_IN_PARENT;
		adSize = AdSize.MEDIUM_RECTANGLE;
		//Update this value with your DFP Ad Unit ID
		MY_AD_UNIT_ID = "/11027047/vrvanapban";
	}
}
