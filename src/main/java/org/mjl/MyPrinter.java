package org.mjl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyPrinter {

    public static void printTheShows(List<Show> showList, Station station) throws IOException {


        String stationName = station.getName();
        String fileName = stationName + ".txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(stationName.toUpperCase());
        writer.newLine();
        writer.newLine();

        for(int i = 0; i < showList.size(); i++) {
            Show currentShow = showList.get(i);
            String time = currentShow.getTimeOfBeginning();
            String genre = currentShow.getGenre();
            String title = currentShow.getTitle();
            String description = currentShow.getDescription();
            String link = currentShow.getLink();


            writer.write(time + " – " + title);
            writer.newLine();
            writer.write("(" + genre + ") – " + description);
            writer.newLine();
            writer.newLine();






        }

        writer.close();




    }
}
