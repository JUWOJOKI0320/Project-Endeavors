package Movies;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        MovieCrud M = new MovieCrud();
        System.out.println("Movie Catalogs\n");
        while(true){
            System.out.println("1. Add Movie");
            System.out.println("2. Display a Movie");
            System.out.println("3. Update a Movie");
            System.out.println("4. Delete a Movie");
            System.out.println("5. Display all Movie");
            System.out.println("6. Exit");
            System.out.print("Option 1-6: ");
            String ch = s.nextLine();
            if (ch.equals("1")){
                M.AddMovie(s);
            }else if (ch.equals("2")){
                M.DisplayMovie(s);
            }else if (ch.equals("3")){
                M.UpdateMovie(s);
            }else if (ch.equals("4")){
                M.DeleteMovie(s);
            }else if (ch.equals("5")){
                M.DisplayAllMovie();
            }else{
                System.out.println("Exiting Program hehehe");
                break;
            }
        }
    }
}
