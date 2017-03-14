package com.example.kaltadesse.myapplication.customview;

import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 *
 *
 * This is modified using databinding
 *
 * just in case we find it necessary that we handle the click events on the
 * layout
 */
@BindingMethods({@BindingMethod(type = ViewGroup.class, attribute = "android:onClick", method = "setOnclickListener")})
public class SettingsLayout extends LinearLayout {

    private boolean isEnabled = true;

    public SettingsLayout(Context context) {
        super(context);
    }

    public SettingsLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SettingsLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isEnabled ? super.onInterceptTouchEvent(ev) : true;
    }

    @Override
    public void setOnClickListener(ViewGroup.OnClickListener clickListener) {
        super.setOnClickListener(clickListener);
    }
}
