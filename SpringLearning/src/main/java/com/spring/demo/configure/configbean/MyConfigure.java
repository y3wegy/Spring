package com.spring.demo.configure.configbean;

import com.spring.demo.simple.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by a549238 on 11/20/2015.
 */
@Configuration
@ComponentScan("com.spring.demo.configure.bean")
@Import(MySubConfig1.class)
public class MyConfigure {

    @Bean(name = "configSimpleBean", initMethod = "initByConifg", destroyMethod = "preDestorybyConfig")
    public SimpleBean getSimpleBean() {
        return new SimpleBean();
    }

}
