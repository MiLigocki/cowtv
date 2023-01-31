package org.mjl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StationLoader {

    private static List<Station> allStations = Arrays.asList(new Station("https://www.teleman.pl/program-tv/stacje/TVP-Kultura", "TVP Kultura"),
            new Station("https://www.teleman.pl/program-tv/stacje/TVN", "TVN"),
            new Station("https://www.teleman.pl/program-tv/stacje/Polsat", "Polsat"),
            new Station("https://www.teleman.pl/program-tv/stacje/TVN-Siedem","TVN 7"),
            new Station("https://www.teleman.pl/program-tv/stacje/Puls", "TV Puls"),
            new Station("https://www.teleman.pl/program-tv/stacje/Cinemax", "Cinemax"),
            new Station("https://www.teleman.pl/program-tv/stacje/Cinemax2", "Cinemax 2"),
            new Station("https://www.teleman.pl/program-tv/stacje/Stopklatka-TV","Stopklatka"));

    public StationLoader(){

    }

    public List<Station> getAllStations() {
        return allStations;
    }

    public void printPrompt() {
        System.out.println("Please choose a number.");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< allStations.size(); i++) {
            String currentStation = i + ": " + allStations.get(i).getName();
            sb.append(currentStation).append("\n");
        }

        String output = sb.toString();
        System.out.println(output);
    }

}
