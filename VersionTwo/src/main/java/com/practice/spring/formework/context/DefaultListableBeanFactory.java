package com.practice.spring.formework.context;

import com.practice.spring.formework.beans.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Tom on 2018/5/2.
 */
public class DefaultListableBeanFactory extends AbstractApplicationContext {

    //beanDefinitionMap用来保存配置信息
    protected Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String,BeanDefinition>();

    protected void onRefresh(){

    }

    @Override
    protected void refreshBeanFactory() {

    }
}
