package com.emerje.springconfiguration;

public class BusItineraryProcessor implements ItineraryProcessor {

    @Override
    public void processItinerary(){
        System.out.println("Processing bus itinerary...");
    };
}
