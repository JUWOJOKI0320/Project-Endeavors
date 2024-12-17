package Library;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Books_CRUD bc = new Books_CRUD();
        System.out.println("Library Management\n");
        while(true){
            System.out.print("1. Add Book\n" +
                    "2. Display Book\n" +
                    "3. Update Book\n" +
                    "4. Delete Book\n" +
                    "5. Display All Book\n" +
                    "6. Exit Program\n"+
                    "Option 1-6: ");
            int n = Integer.parseInt(s.nextLine());
            switch (n){
                case 1:
                    System.out.println("\nAdd Book");
                        bc.AddBook(s);
                    break;
                case 2:
                    System.out.println("Display Book\n");
                    bc.DisplayBook(s);
                    break;
                case 3:
                    System.out.println("Update Book\n");
                    bc.UpdateBook(s);
                    break;
                case 4:
                    System.out.println("Delete Book\n");
                    bc.DeleteBook(s);
                    break;
                case 5:
                    System.out.println("Display All Book\n");
                    bc.DisplayAllBook();
                    break;
                default:
                    System.out.println("Exiting\n");
                    return;
            }
        }
    }
}
