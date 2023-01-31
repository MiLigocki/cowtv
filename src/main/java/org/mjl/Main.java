package org.mjl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        StationLoader stationLoader = new StationLoader();
        stationLoader.printPrompt();

        List<Station> allStations = stationLoader.getAllStations();

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();


        Station chosenStation = allStations.get(index);

        List<Show> chosenShows = StationProcessor.stationToListOfShows(chosenStation);
        String hugeString = Printer.printTheShowsToHugeString(chosenShows, chosenStation);
        System.out.println(hugeString);




    }




}