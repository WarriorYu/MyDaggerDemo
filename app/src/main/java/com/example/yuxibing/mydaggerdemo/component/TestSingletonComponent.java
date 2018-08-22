package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.activity.MainActivity;
import com.example.yuxibing.mydaggerdemo.activity.SecondActivity;
import com.example.yuxibing.mydaggerdemo.annotation.MyScope;
import com.example.yuxibing.mydaggerdemo.module.SecondActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */
@Singleton
@MyScope
@Component(modules = SecondActivityModule.class)
public interface TestSingletonComponent {
    void inject(SecondActivity activity);
}
