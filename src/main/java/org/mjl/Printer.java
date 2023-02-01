package org.mjl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Printer {

    public static void printTheShowsToFile(List<Show> showList, Station station) throws IOException {


        String stationName = station.getName();
        String fileName = stationName.replace(" ", "") + ".txt";

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

            writer.write(time + " - " + title + " - (" + genre + ")");
            writer.newLine();
            writer.write(description);
            writer.newLine();
            writer.newLine();
        }
        writer.close();
    }

    public static String printTheShowsToHugeString (List<Show> showList, Station station) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < showList.size(); i++) {
            Show currentShow = showList.get(i);
            String time = currentShow.getTimeOfBeginning();
            String genre = currentShow.getGenre();
            String title = currentShow.getTitle();
            String description = currentShow.getDescription();
            String link = currentShow.getLink();


            sb.append(time + " – " + title + " – (" + genre + ")");
            sb.append(System.lineSeparator());
            sb.append(description);
            sb.append(System.lineSeparator());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
