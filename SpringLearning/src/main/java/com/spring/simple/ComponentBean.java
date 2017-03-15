package com.spring.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("#{someProperties['Name']}")
    private String name ;

    @Value("#{someProperties['Sex']}")
    private String sex;

    @Value("#{someProperties['School']}")
    private String school;

    @Value("${favourite}")
    private String favourite;

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


    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

}
