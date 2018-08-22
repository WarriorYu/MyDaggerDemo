package com.example.yuxibing.mydaggerdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.yuxibing.mydaggerdemo.R;
import com.example.yuxibing.mydaggerdemo.component.DaggerPlatform;
import com.example.yuxibing.mydaggerdemo.component.DaggerTestComponent;
import com.example.yuxibing.mydaggerdemo.component.DaggerWaimaiPingTai;
import com.example.yuxibing.mydaggerdemo.component.WaimaiPingTai;
import com.example.yuxibing.mydaggerdemo.model.C;
import com.example.yuxibing.mydaggerdemo.model.ScopeTestModel;
import com.example.yuxibing.mydaggerdemo.model.ZhaiNan;
import com.example.yuxibing.mydaggerdemo.module.ShangjiaAModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Dagger 学习
 * 参考：https://blog.csdn.net/briblue/article/details/75578459
 *
 * 理解：1、Component是联系需求与依赖的纽带
 *      2、Dagger2是根据返回值类型来进行依赖关系确定的，如果Module中两个方法返回值类型一样，那Dagger2是没法处理的，那就要用@Name注解就好了
 *      3、@Singleton是被@Scope注解的注解，可以通过@Scope自定义类似@Singgleton的注解
 *      4、@Name是被@Qualifier注解的注解，可以通过@Qualifier自定义类似@Name的注解
 */
public class MainActivity extends AppCompatActivity {

    private ZhaiNan zhaiNanInject;
    private ZhaiNan zhaiNanModule;
    private     C c;
    private ZhaiNan zhaiNan;
    @Inject
    int testValue;
    @Inject
    ScopeTestModel scopeTestModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        zhaiNan = new ZhaiNan();


        zhaiNanInject = DaggerPlatform.builder().shangjiaAModule(new ShangjiaAModule("小王的包子铺")).build().waimai();
        zhaiNanModule = DaggerWaimaiPingTai.builder().shangjiaAModule(new ShangjiaAModule("我的包子铺")).build().waimai();
        WaimaiPingTai waimaiPingTai = DaggerWaimaiPingTai.builder().shangjiaAModule(new ShangjiaAModule("肉饼铺子")).build();
        waimaiPingTai.zhuRu(zhaiNan);
        waimaiPingTai.inject(this);
        c = DaggerTestComponent.builder().build().getC();
        Log.e("ScopeTest----", scopeTestModel.toString());

    }

    @OnClick({R.id.btn_inject,R.id.btn_module,R.id.btn_third,R.id.btn_zhuru,R.id.btn_inject_activity,R.id.btn_second_activity,R.id.btn_third_activity})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_inject:
                Toast.makeText(this,zhaiNanInject.eat() , Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_module:
                Toast.makeText(this,zhaiNanModule.eat() , Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_third:
                Toast.makeText(this,c.printInfo() , Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_zhuru:
                Toast.makeText(this, zhaiNan.eat(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_inject_activity:
                Toast.makeText(this, testValue+"---", Toast.LENGTH_SHORT).show();
                break;

            //单例
            case R.id.btn_second_activity:
                startActivity(new Intent(this,SecondActivity.class));
                break;
            case R.id.btn_third_activity:
                startActivity(new Intent(this,ThirdActivity.class));
                break;

        }
    }
}
