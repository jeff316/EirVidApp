package Functionality;

import Movie.Movie;
import Movie.MovieList;

import java.io.IOException;
import java.util.List;

public class FindMovie {
    private List<Movie> movies;

    public Movie findMovie(String movieName) throws IOException {

        MovieList movieList = new MovieList();
        movies = movieList.createMovieList();
        int i;
        for(i = 0; i < movies.size(); i++) {
            if(movies.get(i).getOriginal_title().matches(movieName)){
                return movies.get(i);
            }

        }
        System.out.println("Sorry, couldn't find the movie: " + movieName);
        return null;
    }
}
