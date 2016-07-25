package com.spring.configure.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by a549238 on 11/20/2015.
 */
@Component("configAnnotationBean")
public class ConfigedAnnotationBean {
    @PostConstruct
    public void initByAnnotation() {
        System.out.println("ConfigedAnnotationBean init by Config by @PostConstruct");
    }

    public void funny() {
        System.out.println("ConfigedAnnotationBean run funny");
    }

}
