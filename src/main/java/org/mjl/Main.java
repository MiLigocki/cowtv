package org.mjl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        StationLoader stationLoader = new StationLoader();
        List<Station> allStations = stationLoader.getAllStations();


        Station chosenStation = allStations.get(0);


        List<Show> chosenShows = StationProcessor.stationToListOfShows(chosenStation);
        String hugeString = Printer.printTheShowsToHugeString(chosenShows, chosenStation);
        System.out.println(hugeString);




    }




}