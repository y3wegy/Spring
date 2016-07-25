package com.spring.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * this bean will be auto scaned and add to application context
 * Created by a549238 on 11/20/2015.
 */
@Scope("prototype")
@Component("componentBean")
public class ComponentBean {
    @Qualifier("Chen,Hairui")
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void funning() {
        System.out.println("ComponentBean says:" + userName);
    }

    @PostConstruct
    public void init() {
        System.out.println("ComponentBean init by PostConstruct");
    }

    @PreDestroy
    public void destory() {
        System.out.println("ComponentBean destory by PreDestroy");
    }

}
