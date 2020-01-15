package com.gmf.myapp;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * author: gmf
 * created on: 2020/1/15 17:28
 * description:
 */
public class GMFApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
