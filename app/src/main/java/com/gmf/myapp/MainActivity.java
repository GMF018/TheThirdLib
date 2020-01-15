package com.gmf.myapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.gmf.myapp.base.StatusBarActivity;
import com.gmf.myapp.bean.TestBean;

import java.util.List;

import butterknife.BindView;

/**
 * Created by gmf on 2019/8/14/15:32
 */
public class MainActivity extends StatusBarActivity {
    @BindView(R.id.rv_test_example)
    RecyclerView rvTestExample;

    @Override
    protected int findLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {
        rvTestExample.setLayoutManager(new GridLayoutManager(this, 3));
        RouterPath.init();
        BaseAdapter adapter = new BaseAdapter(RouterPath.testBeans);
        adapter.setOnItemClickListener((adapter1, view, position) -> {
            TestBean testBean = (TestBean) adapter1.getData().get(position);
            ARouter.getInstance().build(testBean.path).navigation();
        });

        rvTestExample.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    public class BaseAdapter extends BaseQuickAdapter<TestBean, BaseViewHolder> {

        public BaseAdapter(@Nullable List<TestBean> data) {
            super(R.layout.common_item_text, data);
        }

        @Override
        protected void convert(@NonNull BaseViewHolder helper, TestBean item) {
            helper.setText(R.id.tv_text, item.name);

        }
    }
}
