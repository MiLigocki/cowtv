package org.mjl;

import java.util.ArrayList;
import java.util.List;

public class StationLoader {

    List<Station> allStations = new ArrayList<>();
    public StationLoader(){

        Station kultura = new Station("https://www.teleman.pl/program-tv/stacje/TVP-Kultura", "TVP Kultura");
        Station tvn = new Station("https://www.teleman.pl/program-tv/stacje/TVN", "TVN");
        Station polsat = new Station("https://www.teleman.pl/program-tv/stacje/Polsat", "Polsat");
        Station tvn7 = new Station("https://www.teleman.pl/program-tv/stacje/TVN-Siedem","TVN 7");
        Station tvPuls = new Station("https://www.teleman.pl/program-tv/stacje/Puls", "TV Puls");
        Station cinemax = new Station("https://www.teleman.pl/program-tv/stacje/Cinemax", "Cinemax");
        Station cinemax2 = new Station("https://www.teleman.pl/program-tv/stacje/Cinemax2", "Cinemax 2");
        Station stopklatka = new Station("https://www.teleman.pl/program-tv/stacje/Stopklatka-TV","Stopklatka");

        allStations.add(kultura);
        allStations.add(tvn);
        allStations.add(polsat);
        allStations.add(tvn7);
        allStations.add(tvPuls);
        allStations.add(cinemax);
        allStations.add(cinemax2);
        allStations.add(stopklatka);

    }

    public List<Station> getAllStations() {
        return allStations;
    }

}
