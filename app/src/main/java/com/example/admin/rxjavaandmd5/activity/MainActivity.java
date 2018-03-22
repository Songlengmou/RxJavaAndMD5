package com.example.admin.rxjavaandmd5.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.rxjavaandmd5.R;
import com.example.admin.rxjavaandmd5.othersManger.RxActivity;

import butterknife.Bind;

public class MainActivity extends RxActivity {

    @Bind(R.id.tv)
    TextView textView;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

    @Override
    protected void loadData() {

    }
}
