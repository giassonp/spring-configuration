package com.emerje.springconfiguration;

public class TrainItineraryProcessor implements ItineraryProcessor {

    @Override
    public void processItinerary(){
        System.out.println("Processing train itinerary...");
    };
}
