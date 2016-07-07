package com.spring.demo.configure.configbean;

import com.spring.demo.simple.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by a549238 on 11/20/2015.
 */
@Configuration
public class MySubConfig1 {
    @Bean(name = "configAnnotationBean")
    public AnnotationBean getAnnotationSimpleBean() {
        return new AnnotationBean();
    }
}
