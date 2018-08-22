package com.example.yuxibing.mydaggerdemo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：自定义单例注解
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScope {
}
