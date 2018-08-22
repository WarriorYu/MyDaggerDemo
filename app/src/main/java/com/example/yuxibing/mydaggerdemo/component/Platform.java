package com.example.yuxibing.mydaggerdemo.component;

import com.example.yuxibing.mydaggerdemo.model.ZhaiNan;
import com.example.yuxibing.mydaggerdemo.module.ShangjiaAModule;

import dagger.Component;


/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */

@Component(modules = ShangjiaAModule.class)
public interface Platform {
    ZhaiNan waimai();
}
