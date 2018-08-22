package com.example.yuxibing.mydaggerdemo.model;

import javax.inject.Inject;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */

public class ZhaiNan {
    @Inject
    BaoZi baoZi;
    @Inject
    Noodle noodle;

    @Inject
    public ZhaiNan() {

    }
    @Inject
    String resturant;

    public String eat() {
        StringBuilder builder = new StringBuilder();
        builder.append("我从");
        builder.append(resturant);
        builder.append("定的外卖");
        builder.append("我吃的是：");
        if (baoZi != null) {
            builder.append(baoZi.toString());
        }
        if (noodle != null) {
            builder.append("    ");
            builder.append(noodle.toString());
        }
        return builder.toString();
    }

}
