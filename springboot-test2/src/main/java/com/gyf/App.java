package com.gyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author QY3022
 *  springboot项目启动class
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.gyf")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
