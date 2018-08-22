package com.example.yuxibing.mydaggerdemo.model;

import javax.inject.Inject;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */

public class BaoZi {
    String name;

    @Inject
    public BaoZi() {
        name = "小笼包";
    }


    public BaoZi(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

}
