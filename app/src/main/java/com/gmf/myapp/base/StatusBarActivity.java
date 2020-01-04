package com.gmf.myapp.base;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.gmf.myapp.R;
import com.gmf.myapp.utils.StatusBarUtils;

/**
 * Created by gmf on 2019/8/14/15:32
 */
public abstract class StatusBarActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            int result = StatusBarUtils.StatusBarLightMode(this);
            if(result != 0){
                StatusBarUtils.setStatusBarColor(this, R.color.status_bar_color);
            }else{
                StatusBarUtils.setStatusBarColor(this, R.color.status_bar_color2);
            }
        }

    }
}
