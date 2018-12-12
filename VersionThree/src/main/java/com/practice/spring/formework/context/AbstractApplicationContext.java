package com.practice.spring.formework.context;

/**
 * Created by Tom on 2018/5/2.
 */
public abstract class AbstractApplicationContext {


    //提供给子类重写
    protected void onRefresh(){
        // For subclasses: do nothing by default.
    }

    protected abstract void refreshBeanFactory();

}
