package com;

import com.config.SpringConfiguration;
import com.service.BusinessLogic;
import com.service.TimerMethods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            var businessLogic = context.getBean("logic", BusinessLogic.class);
            var timerMethods = context.getBean("timerMethods", TimerMethods.class);
            businessLogic.sayHello();
            businessLogic.sayHello10();
            timerMethods.startMethods();
        }
    }
}