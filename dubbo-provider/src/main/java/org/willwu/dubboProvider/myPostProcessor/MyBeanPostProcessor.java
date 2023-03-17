package org.willwu.dubboProvider.myPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.willwu.dubboProvider.service.impl.UserServiceImpl;

/**
 * @ClassName MyBeanPostProcessor
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 16:35
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor, BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userServiceImpl".equals(beanName)) {
            if (bean instanceof UserServiceImpl) {
                System.out.println(classLoader);
            }
            System.out.println("Bean实例化之前===============");
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userServiceImpl".equals(beanName)) {
            System.out.println("Bean实例化之后=================");
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
