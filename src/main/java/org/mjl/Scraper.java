package org.mjl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Scraper {

    public static Document getDocument( String url) throws IOException {
        Document document;

        Connection connection = Jsoup.connect(url);
        document = connection.get();
        return document;
    }
}
