package com.emerje.springconfiguration.config;

import com.emerje.springconfiguration.BusItineraryProcessor;
import com.emerje.springconfiguration.ItineraryProcessor;
import com.emerje.springconfiguration.NavigationSystem;
import com.emerje.springconfiguration.TrainItineraryProcessor;
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
