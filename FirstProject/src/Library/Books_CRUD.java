package Library;
import java.awt.print.Book;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Books_CRUD{
    ArrayList<Books_info> Books = new ArrayList<>();
    String[] inputs = new String[4];
    public void AddBook(Scanner s){
        System.out.print("Book Title: "); inputs[0] = s.nextLine();
        System.out.print("Genre: "); inputs[1] = s.nextLine();
        System.out.print("Author Name: "); inputs[2] = s.nextLine();
        System.out.print("Date Published: "); inputs[3] = s.nextLine();
        System.out.print("Pages: "); int input = Integer.parseInt(s.nextLine());
        Books.add(new Books_info(inputs[0],inputs[1],inputs[2], inputs[3],input));
        System.out.println("\n Book Added ^_^");
    }
    public void DisplayBook(Scanner s){
        System.out.println("Book Title to Display: ");
        String title = s.nextLine();
        for(Books_info b: Books){
            if(b.getBook_Title().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }
    public void UpdateBook(Scanner s){
        System.out.println("Book Title to Update: ");
        String title = s.nextLine();
        for(Books_info b : Books){
            if(b.getBook_Title().equalsIgnoreCase(title)){
                System.out.print("Book Title: ");
                String Book_Title = s.nextLine();
                b.setBook_Title(Book_Title);
                System.out.print("\nGenre: ");
                String Genre = s.nextLine();
                b.setGenre(Genre);
                System.out.print("\nAuthor Name: ");
                String Author_name = s.nextLine();
                b.setAuthor_Name(Author_name);
                System.out.print("\nDate Published: ");
                String Date_Published = s.nextLine();
                b.setDate_Published(Date_Published);
                System.out.print("\nPages: ");
                int Pages = Integer.parseInt(s.nextLine());
                b.setPages(Pages);
            }
        }
    }
    public void DeleteBook(Scanner s){
        System.out.println("Book Title to be Deleted");
        String Title = s.nextLine();
        int i=0;
        for(Books_info b : Books){
            if(b.getBook_Title().equalsIgnoreCase(Title)){
                Books.remove(i);
            }
            i++;
        }
    }
    public void DisplayAllBook(){
        for(Books_info b : Books){
            System.out.println(b);
        }
    }
}
