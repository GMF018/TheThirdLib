package com.gmf.myapp.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.gmf.myapp.R;
import com.gmf.myapp.RouterPath;
import com.gmf.myapp.base.StatusBarActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

@Route(path = RouterPath.PATH_COORDINATORACTIVITY)
public class CoordinatorActivity extends StatusBarActivity {

    @BindView(R.id.recycler_view)
    RecyclerView rv_a;

    @Override
    protected void init() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(i + "：测试");
        }

        rv_a.setLayoutManager(new LinearLayoutManager(this));
        BaseAdapter adapter = new BaseAdapter(data);
        rv_a.setAdapter(adapter);
    }

    @Override
    protected int findLayoutResID() {
        return R.layout.activity_coordinator;
    }

    public class BaseAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public BaseAdapter(@Nullable List<String> data) {
            super(R.layout.common_item_text, data);
        }

        @Override
        protected void convert(@NonNull BaseViewHolder helper, String item) {
            helper.setText(R.id.tv_text, item);

        }
    }
}
