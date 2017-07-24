package sg.edu.rp.c346.movielist;

/**
 * Created by 16046469 on 17/7/2017.
 */

public class Movie {
    public String title;
    public String year;
    public String genre;
    public String reted;
    public String watched_on;
    public String in_theatre;
    public String description;


    public Movie(String title, String year, String reted,String genre, String watched_on, String in_theatre, String description) {
        this.title = title;
        this.year = year;
        this.reted=reted;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
    }

    public String getReted() {
        return reted;
    }

    public void setReted(String reted) {
        this.reted = reted;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
