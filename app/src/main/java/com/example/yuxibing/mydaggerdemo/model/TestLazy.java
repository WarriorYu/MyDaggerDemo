package com.example.yuxibing.mydaggerdemo.model;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */

public class TestLazy {
    @Inject
    public TestLazy() {
    }

    public String getName() {
        return "懒加载了";
    }
}
