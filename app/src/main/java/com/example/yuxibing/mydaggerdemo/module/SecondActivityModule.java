package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.annotation.Computer;
import com.example.yuxibing.mydaggerdemo.annotation.MyScope;
import com.example.yuxibing.mydaggerdemo.annotation.Phone;
import com.example.yuxibing.mydaggerdemo.model.ScopeTestModel;
import com.example.yuxibing.mydaggerdemo.model.TestSingleton;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Module
public class SecondActivityModule {

    /**
     * 通过Provides方式提供单例的话
     *
     * @return
     */
    @Provides
    @Singleton
    public TestSingleton provideTestSingle() {
        return new TestSingleton();
    }

    @Provides
    @MyScope
    public ScopeTestModel provideScopeTestModel() {
        return new ScopeTestModel();
    }

    @Provides
    @Phone
    public String providePhone() {
        return "手机";
    }

    @Provides
    @Computer
    public String provideComputer() {
        return "电脑";
    }

}
