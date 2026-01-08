package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class SpringBean implements BeanNameAware, BeanFactoryAware , ApplicationContextAware, DisposableBean, InitializingBean {
    public SpringBean(){

        System.out.println("Spring Bean Created");
    }



    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Name");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory Name called ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is Called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy is Called");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is Called");

    }
}

