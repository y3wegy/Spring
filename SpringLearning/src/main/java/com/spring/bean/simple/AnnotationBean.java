package com.spring.bean.simple;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by a549238 on 11/20/2015.
 */
public class AnnotationBean {
    @Qualifier("Chen,Hairui")
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void funning() {
        System.out.println("AnnotationBean says:" + userName);
    }

    @PostConstruct
    public void init() {
        System.out.println("AnnotationBean init by annotation @PostConstrator");
    }

    @PreDestroy
    public void destory() {
        System.out.println("AnnotationBean destory by annotation @PreDestroy");
    }

}
