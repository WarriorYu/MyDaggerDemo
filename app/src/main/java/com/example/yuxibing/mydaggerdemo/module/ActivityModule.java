package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.annotation.MyScope;
import com.example.yuxibing.mydaggerdemo.model.ScopeTestModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */
@Module
public class ActivityModule {
    @Provides
    public int provideIntValue() {
        return 12345;
    }
    @Provides
    @MyScope
    public ScopeTestModel provideScopeTestModel(){
       return new ScopeTestModel();
    }
}
