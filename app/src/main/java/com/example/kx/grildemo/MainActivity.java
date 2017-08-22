package com.example.kx.grildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lv)
    ListView mLv;

    private Gson mGson = new Gson();

    private List<GrilBean.ResultsBean> mData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        AsyncRequest();

    }

    private void initView() {
        mLv.setAdapter(mAdapter);
        mLv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if(i == SCROLL_STATE_IDLE){
                    if(mLv.getLastVisiblePosition() == mData.size()-1){
                        AsyncRequest();
                    }

                }
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {

            }
        });
    }

    BaseAdapter mAdapter =new  BaseAdapter(){

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View converView, ViewGroup viewGroup) {
            ViewHolder holder ;

            if(converView ==null){
                converView = View.inflate(MainActivity.this,R.layout.item_list,null);
                holder = new ViewHolder(converView);

                converView.setTag(holder);
            }else{
                holder = (ViewHolder) converView.getTag();
            }

            GrilBean.ResultsBean bean = mData.get(i);

            holder.tv.setText(bean.getPublishedAt());

            Glide.with(MainActivity.this).load(bean.getUrl()).into(holder.lv);

            return converView;
        }
    };

    static class ViewHolder{
        ImageView lv;
        TextView tv ;

        public ViewHolder(View converView){
            lv = converView.findViewById(R.id.iv);
            tv = converView.findViewById(R.id.tv);
        }
    }




    private void AsyncRequest() {
        String url = "http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/"+mData.size()/10 +1;

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().get().url(url).build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();

                GrilBean grilBean = mGson.fromJson(result, GrilBean.class);
                mData.addAll(grilBean.getResults());

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter.notifyDataSetChanged();
                    }
                });

            }
        });


    }
}
