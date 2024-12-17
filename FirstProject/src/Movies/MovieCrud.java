package Movies;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieCrud{
    public static ArrayList<Movie_info> MI = new ArrayList<>();

    public void AddMovie(Scanner s){
        System.out.println("Add a Movie\n");
        System.out.print("Movie Name: ");
        String MovieName = s.nextLine();
        System.out.print("Movie Genre: ");
        String MovieGenre = s.nextLine();
        System.out.print("Rating: ");
        float Rating = Float.parseFloat(s.nextLine());
        System.out.print("Release Date: ");
        String ReleaseDate = s.nextLine();
        MI.add(new Movie_info(MovieName,MovieGenre,Rating,ReleaseDate));
    }
    public void DisplayMovie(Scanner s){
        System.out.println("Display a Movie\n");
        System.out.print("Movie Name: ");
        String MovieName = s.nextLine();
        for(Movie_info movinf: MI){
            if(movinf.getMovieName().equalsIgnoreCase(MovieName)){
                System.out.println(movinf);
                break;
            }
        }
    }
    public void UpdateMovie(Scanner s){
        System.out.println("Update a Movie\n");
        System.out.print("Movie Name: ");
        String MovieName = s.nextLine();
        for (Movie_info movinf: MI){
            if(movinf.getMovieName().equalsIgnoreCase(MovieName)){
                System.out.print("New Movie Name: ");
                movinf.setMovieName(s.nextLine());
                System.out.print("New Movie Genre: ");
                movinf.setMovieGenre(s.nextLine());
                System.out.print("New Rating: ");
                movinf.setRating(Float.parseFloat(s.nextLine()));
                System.out.print("New Release Date: ");
                movinf.setReleaseDate(s.nextLine());
                System.out.println("Done Updating!");
                break;
            }
        }
    }
    public void DeleteMovie(Scanner s){
        System.out.println("Update a Movie\n");
        System.out.print("Movie Name: ");
        String MovieName = s.nextLine();
        int i=0;
        for (Movie_info movinf: MI){
            if(movinf.getMovieName().equalsIgnoreCase(MovieName)){
                MI.remove(i);
                System.out.println("Movie Record Deleted");
                break;
            }
            i++;
        }
    }
    public void DisplayAllMovie(){
        int i=0;
        for(Movie_info movinf: MI){
            System.out.println("Movie Name: "+movinf.getMovieName()+"\nMovie Genre: "+ movinf.getMovieGenre()+ "\nRating: " +movinf.getRating()+ "\nRelease Date: " + movinf.getReleaseDate());
            i++;
        }
    }
}
