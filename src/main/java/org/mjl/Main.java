package org.mjl;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        StationLoader stationLoader = new StationLoader();
        List<Station> allStations = stationLoader.getAllStations();

        stationLoader.chooseStationPrompt();

        int index;
        int maxSize = allStations.size() - 1;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please choose a number between 0 and " + maxSize);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid input, try again!");
                sc.next();
            }
            index = sc.nextInt();
        } while (index < 0 || index >= maxSize);

        Station chosenStation = allStations.get(index);
        List<Show> chosenShows = StationProcessor.stationToListOfShows(chosenStation);
        String hugeString = Printer.printTheShowsToHugeString(chosenShows, chosenStation);
        System.out.println(hugeString);
        
        System.out.println("Do you want to create a text file with this information?");
        if(sc.next().toLowerCase().contains("y")){
            Printer.printTheShowsToFile(chosenShows, chosenStation);
        } else {
            System.exit(0);
        }
    }


}