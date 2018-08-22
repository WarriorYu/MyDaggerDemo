package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.activity.ThirdActivity;
import com.example.yuxibing.mydaggerdemo.module.FoodModule;
import com.example.yuxibing.mydaggerdemo.module.XiaoChiModule;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Subcomponent(modules = FoodModule.class)
public interface SubComponent {
    void inject(ThirdActivity activity);
}
