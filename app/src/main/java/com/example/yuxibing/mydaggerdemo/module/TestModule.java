package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.model.A;
import com.example.yuxibing.mydaggerdemo.model.AA;
import com.example.yuxibing.mydaggerdemo.model.B;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */

@Module
public class TestModule {
    @Provides
    public A provideA(AA aa){
        return aa;
    }
    @Provides
    public B provideB(){
        return new B();
    }
}
