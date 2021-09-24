package com.emmerje.springconfiguration.config;

import com.emmerje.springconfiguration.BusItineraryProcessor;
import com.emmerje.springconfiguration.ItineraryProcessor;
import com.emmerje.springconfiguration.NavigationSystem;
import com.emmerje.springconfiguration.TrainItineraryProcessor;
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
