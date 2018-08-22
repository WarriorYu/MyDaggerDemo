package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.model.C;
import com.example.yuxibing.mydaggerdemo.module.TestModule;

import dagger.Component;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */

@Component(modules = TestModule.class)
public interface TestComponent {
    C getC();
}
