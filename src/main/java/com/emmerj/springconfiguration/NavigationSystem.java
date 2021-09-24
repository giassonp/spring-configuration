package com.emmerj.springconfiguration;

public class NavigationSystem {

    private ItineraryProcessor itineraryProcessor;

    // Inject dependency via constructor
    public NavigationSystem(ItineraryProcessor itineraryProcessor){
        this.itineraryProcessor = itineraryProcessor;
    }

    // Inject dependency via setter
    public void setItineraryProcessor(ItineraryProcessor itineraryProcessor){
        this.itineraryProcessor = itineraryProcessor;
    }

    public void getItinary(){
        itineraryProcessor.processItinerary();
    }
}
