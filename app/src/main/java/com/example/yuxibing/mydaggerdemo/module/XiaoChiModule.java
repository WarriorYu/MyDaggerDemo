package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.model.Guazi;
import com.example.yuxibing.mydaggerdemo.model.HuoTui;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Module
public class XiaoChiModule {
    @Provides
    public Guazi provideGuazi(){
        return new Guazi();
    }
    @Provides
    public HuoTui provideHuoTui(){
        return new HuoTui();
    }
}
