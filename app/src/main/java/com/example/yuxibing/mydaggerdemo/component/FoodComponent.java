package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.activity.SecondActivity;
import com.example.yuxibing.mydaggerdemo.activity.ThirdActivity;
import com.example.yuxibing.mydaggerdemo.module.FoodModule;

import dagger.Component;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Component(modules = FoodModule.class,dependencies = XiaoChiComponent.class)
public interface FoodComponent {
    void inject(ThirdActivity activity);
}
