package Movies;

public class Movie_info{
    private String MovieName, MovieGenre;
    private float Rating;
    private String ReleaseDate;

    Movie_info(){}

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieGenre() {
        return MovieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        MovieGenre = movieGenre;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    Movie_info(String MovieName, String MovieGenre, float Rating, String ReleaseDate){
        this.MovieName = MovieName;
        this.MovieGenre = MovieGenre;
        this.Rating = Rating;
        this.ReleaseDate = ReleaseDate;
    }
    @Override
    public String toString(){
        return "Movie Name: "+ MovieName +
                " Movie Genre: "+ MovieGenre +
                " Rating: " + Rating +
                " Release Date: " + ReleaseDate +" ";
    }
}
