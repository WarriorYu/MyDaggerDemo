package com.example.yuxibing.mydaggerdemo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by yuxibing on 2018/8/20.
 * 描述：
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
}
