package com.internship.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean.getClass().isAnnotationPresent(Service.class)) {
            System.err.println("Name of class: " + bean.getClass().getEnclosingClass());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean.getClass().isAnnotationPresent(Service.class)) {
            System.err.println("Name of class: " + bean.getClass().getEnclosingClass());
        }
        return bean;
    }


}
