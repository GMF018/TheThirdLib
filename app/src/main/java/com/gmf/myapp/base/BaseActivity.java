package com.gmf.myapp.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by gmf on 2019/8/14/15:32
 */
public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(findLayoutResID());
        //全屏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        unbinder = ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();

    }

    protected abstract void init();

    protected abstract int findLayoutResID();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ARouter.getInstance().destroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
