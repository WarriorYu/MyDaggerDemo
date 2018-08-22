package com.example.yuxibing.mydaggerdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.yuxibing.mydaggerdemo.R;
import com.example.yuxibing.mydaggerdemo.component.DaggerFoodComponent;
import com.example.yuxibing.mydaggerdemo.component.DaggerParentComponent;
import com.example.yuxibing.mydaggerdemo.component.DaggerXiaoChiComponent;
import com.example.yuxibing.mydaggerdemo.component.XiaoChiComponent;
import com.example.yuxibing.mydaggerdemo.model.BaoZi;
import com.example.yuxibing.mydaggerdemo.model.Guazi;
import com.example.yuxibing.mydaggerdemo.model.HuoTui;
import com.example.yuxibing.mydaggerdemo.model.Noodle;

import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity {
    @Inject
    BaoZi baoZi;
    @Inject
    Noodle noodle;
    @Inject
    Guazi guazi;
    @Inject
    HuoTui huoTui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        XiaoChiComponent xiaoChiComponent = DaggerXiaoChiComponent.builder().build();
        DaggerFoodComponent.builder().xiaoChiComponent(xiaoChiComponent).build().inject(this);
//        DaggerParentComponent.builder().build().provideSubComponent().inject(this);
        Log.e("Component之间的依赖--", baoZi + "--" + noodle + "--" + guazi + "--" + huoTui);
    }
}
