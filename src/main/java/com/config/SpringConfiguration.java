package com.config;

import com.aspects.LoggingAspect;
import com.service.BusinessLogic;
import com.aspects.TimingAspect;
import com.service.ReversedSort;
import com.service.SimpleSort;
import com.service.TimerMethods;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class SpringConfiguration {

    @Bean
    public BusinessLogic logic() {
        return new BusinessLogic();
    }

    @Bean
    public TimerMethods timerMethods(){
        return new TimerMethods(simpleSort(), reversedSort());
    }

    @Bean
    public LoggingAspect logging() {
        return new LoggingAspect();
    }

    @Bean
    public SimpleSort simpleSort() {
        return new SimpleSort();
    }

    @Bean
    public ReversedSort reversedSort() {
        return new ReversedSort();
    }

    @Bean
    @Scope(value = "singleton")
    public TimingAspect tl() {
        return new TimingAspect();
    }

}
