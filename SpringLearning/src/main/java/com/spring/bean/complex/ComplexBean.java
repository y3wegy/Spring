package com.spring.bean.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by a549238 on 3/15/2017.
 */
@Component("ComplexBean")
public class ComplexBean {
    @Autowired
    @Qualifier("ChildBean")
    private Child childBean;

    public void sayYY(){
        childBean.sayHello();
}
}

@Component("ChildBean")
class Child{
    public void sayHello(){
        System.out.println("Hello");
    }
}
