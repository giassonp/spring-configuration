package com.emmerj.springconfiguration;

public class TrainItineraryProcessor implements ItineraryProcessor {

    @Override
    public void processItinerary(){
        System.out.println("Processing train itinerary...");
    };
}
