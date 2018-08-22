package com.example.yuxibing.mydaggerdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.yuxibing.mydaggerdemo.R;
import com.example.yuxibing.mydaggerdemo.annotation.Computer;
import com.example.yuxibing.mydaggerdemo.annotation.Phone;
import com.example.yuxibing.mydaggerdemo.component.DaggerTestSingletonComponent;
import com.example.yuxibing.mydaggerdemo.model.ScopeTestModel;
import com.example.yuxibing.mydaggerdemo.model.TestLazy;
import com.example.yuxibing.mydaggerdemo.model.TestSingleton;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Lazy;

public class SecondActivity extends AppCompatActivity {
    @Inject
    TestSingleton singleton1;
    @Inject
    TestSingleton singleton2;
    @Inject
    ScopeTestModel scopeTestModel;
    @Inject
    @Phone
    String phone;
    @Inject
    @Computer
    String computer;
    @Inject
    Lazy<TestLazy> testLazy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        DaggerTestSingletonComponent.builder().build().inject(this);
//        Log.e("ScopeTest----", scopeTestModel.toString());
//        Log.e("@Name--", phone + "---" + computer);
        Log.e("Testlazy---", testLazy.get().getName());

    }

    @OnClick(R.id.btn_singleton)
    public void onViewClicked() {
        Toast.makeText(this, singleton1.toString() + "-----" + singleton2.toString(),Toast.LENGTH_SHORT).show();
//        Log.e("SINGGLETON--", singleton1.toString() + "-----" + singleton2.toString());

    }
}
