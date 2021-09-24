package com.emmerje.springconfiguration;

import com.emmerje.springconfiguration.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        NavigationSystem navigationSystem = applicationContext.getBean(NavigationSystem.class);

        navigationSystem.getItinary();
    }
}