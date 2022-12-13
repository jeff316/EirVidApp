package Movie;

/**
 *
 * @author Bekezhan Abdykarimov
 */

public class Movie {

    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String release_date;
    private double runtime;
    private String tagline;
    private String title;
    private double vote_average;
    private double vote_count;
    private double price;

    public Movie(String original_language, String original_title, String overview, double popularity, String release_date, double runtime, String tagline, String title, double vote_average, double vote_count, double price) {
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.release_date = release_date;
        this.runtime = runtime;
        this.tagline = tagline;
        this.title = title;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.price = price;
    }
    public void getMovie(){
        System.out.println("original_language: " + getOriginal_language());
        System.out.println("original_title: " + getOriginal_title() );
        System.out.println("overview: " + getOverview());
        System.out.println("popularity: " + getPopularity());
        System.out.println("release_date: " + getRelease_date());
        System.out.println("runtime: " + getRuntime());
        System.out.println("tagline: " + getTagline());
        System.out.println("title: " + getTitle() );
        System.out.println("vote_average: " + getVote_average());
        System.out.println("vote_count: " + getVote_count());
        System.out.println("price: " + getPrice());

    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getRelease_date() {
        return release_date;
    }

    public double getRuntime() {
        return runtime;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public double getVote_average() {
        return vote_average;
    }

    public double getVote_count() {
        return vote_count;
    }

    public double getPrice() {
        return price;
    }
}


