package org.mjl;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.mjl.GUI.GUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        
        List<Station> allStations = StationLoader.getAllStations();

        Station station1 = allStations.get(0);

        List<Show> chosenShows = processTheStation(station1);





    }

    private static List<Show> processTheStation(Station station) throws IOException {
        String url = station.getUrl();

        Document doc = Scraper.getDocument(url);

        Element stationListing = doc.body().getElementById("stationListing");
        Element stationItems = stationListing.getElementsByClass("stationItems").first();
        Elements shows = stationItems.getElementsByTag("li");


        List<Show> listOfShows = new ArrayList<>();


        for (Element s : shows) {
            
            String time = s.getElementsByTag("em").text();
            String link = s.select("a[href]").attr("href");
            String genre = s.select(".genre").text();
            String title = s.select(".detail > a").text();
            String description = s.select("p").next().text();
            
            Show show = new Show();
            show.setTimeOfBeginning(time);
            show.setLink("https://www.teleman.pl" + link);
            show.setGenre(genre);
            show.setTitle(title);
            show.setDescription(description);
            
            listOfShows.add(show);
        }

        List<Show> showsAfterFiltering = listOfShows.stream()
                .filter(e -> !e.getTimeOfBeginning().equals(""))
                .collect(Collectors.toList());


//        showsAfterFiltering.stream().forEach(System.out::println);
        return showsAfterFiltering;

    }


}