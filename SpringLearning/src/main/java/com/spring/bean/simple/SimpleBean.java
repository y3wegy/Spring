package com.spring.bean.simple;

/**
 * Created by a549238 on 11/20/2015.
 */
public class SimpleBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void funning() {
        System.out.println("SimpleBean says: " + name);
    }

    public void init() {
        System.out.println("SimpleBean init finished");
    }

    public void preDestory() {
        System.out.println("SimpleBean destory finished");
    }

    public void initByConifg() {
        System.out.println("SimpleBean init by config finished");
    }


    public void preDestorybyConfig() {
        System.out.println("SimpleBean destory  by config finished");
    }

}
