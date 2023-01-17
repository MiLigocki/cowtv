package org.mjl;

import java.util.ArrayList;
import java.util.List;

public class StationLoader {


    public static List<Station> getAllStations(){
        //dodać jeszcze:
        //Stopklatka, TVN 7, TV Puls, TVN, Polsat
        Station kultura = new Station("https://www.teleman.pl/program-tv/stacje/TVP-Kultura", "TVP Kultura");
        Station cinemax = new Station("https://www.teleman.pl/program-tv/stacje/Cinemax", "Cinemax");
        Station cinemax2 = new Station("https://www.teleman.pl/program-tv/stacje/Cinemax2", "Cinemax 2");
        List<Station> allStations = new ArrayList<>();
        allStations.add(kultura);
        allStations.add(cinemax);
        allStations.add(cinemax2);
        return allStations;

    }

}
