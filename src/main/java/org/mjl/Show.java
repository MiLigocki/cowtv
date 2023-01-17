package org.mjl;

public class Show {
    @Override
    public String toString() {
        return "Show{" +
                "timeOfBeginning='" + timeOfBeginning + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    String timeOfBeginning;
    String title;
    String link;
    String genre;
    String description;

    public Show(String timeOfBeginning, String title, String link, String genre, String description) {
        this.timeOfBeginning = timeOfBeginning;
        this.title = title;
        this.link = link;
        this.genre = genre;
        this.description = description;
    }

    public Show(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTimeOfBeginning() {
        return timeOfBeginning;
    }

    public void setTimeOfBeginning(String timeOfBeginning) {
        this.timeOfBeginning = timeOfBeginning;
    }


}
