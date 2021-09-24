package com.emmerj.springconfiguration.config;

import com.emmerj.springconfiguration.BusItineraryProcessor;
import com.emmerj.springconfiguration.ItineraryProcessor;
import com.emmerj.springconfiguration.NavigationSystem;
import com.emmerj.springconfiguration.TrainItineraryProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ItineraryProcessor trainItineraryProcessor(){
        return new TrainItineraryProcessor();
    }

    @Bean
    public ItineraryProcessor busItineraryProcessor(){
        return new BusItineraryProcessor();
    }

    @Bean
    public NavigationSystem navigationSystem(){
        return new NavigationSystem(trainItineraryProcessor());
/*        NavigationSystem navigationSystem = new NavigationSystem();
        navigationSystem.setItineraryProcessor(trainItineraryProcessor());
        return navigationSystem;*/
    }
}
