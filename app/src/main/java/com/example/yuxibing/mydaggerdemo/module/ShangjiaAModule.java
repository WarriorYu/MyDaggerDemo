package com.example.yuxibing.mydaggerdemo.module;

import com.example.yuxibing.mydaggerdemo.model.BaoZi;
import com.example.yuxibing.mydaggerdemo.model.Noodle;
import com.example.yuxibing.mydaggerdemo.model.Tongyi;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuxibing on 2018/8/17.
 * 描述：
 */
@Module
public class ShangjiaAModule {
    private String resturant;

    public ShangjiaAModule(String resturant) {
        this.resturant = resturant;
    }

    @Provides
    public BaoZi provideBaoZi(){
        return new BaoZi("豆沙包");
    }
    @Provides
    public Noodle provideNoodle(Tongyi noodle){
        return noodle;
    }

    @Provides
    public Tongyi provideTongyi() {
        return new Tongyi();
    }
    @Provides
    public String provideResturant(){
        return resturant;
    }

}
