package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.model.BaoZi;
import com.example.yuxibing.mydaggerdemo.model.Noodle;
import com.example.yuxibing.mydaggerdemo.model.Tongyi;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Module
public class FoodModule {
    @Provides
    public BaoZi provideBaozi(){
        return new BaoZi();
    }
    @Provides
    public Noodle provideNoodle(){
        return new Tongyi();
    }
}
