package com.emerje.springconfiguration;

public class NavigationSystem {

    private ItineraryProcessor itineraryProcessor;

    public NavigationSystem(ItineraryProcessor itineraryProcessor){
        this.itineraryProcessor = itineraryProcessor;
    }

    public void getItinary(){
        itineraryProcessor.processItinerary();
    }
}
