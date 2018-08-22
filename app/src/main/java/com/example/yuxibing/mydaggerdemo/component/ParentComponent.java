package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.module.XiaoChiModule;

import dagger.Component;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Component(modules = XiaoChiModule.class)
public interface ParentComponent {
    SubComponent provideSubComponent();
}
