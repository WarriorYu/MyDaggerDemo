package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.activity.MainActivity;
import com.example.yuxibing.mydaggerdemo.annotation.MyScope;
import com.example.yuxibing.mydaggerdemo.model.ZhaiNan;
import com.example.yuxibing.mydaggerdemo.module.ActivityModule;
import com.example.yuxibing.mydaggerdemo.module.ShangjiaAModule;

import dagger.Component;
import dagger.Module;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */
@MyScope
@Component(modules = {ShangjiaAModule.class, ActivityModule.class})
public interface WaimaiPingTai {
    ZhaiNan waimai();

    void zhuRu(ZhaiNan zhaiNan);

    void inject(MainActivity activity);
}
