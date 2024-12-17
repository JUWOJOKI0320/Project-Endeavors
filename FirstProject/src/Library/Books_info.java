package Library;

import java.awt.print.Book;

public class Books_info {
    private String Book_Title, Author_Name, Date_Published, Genre;
    private int Pages;

    Books_info(){}

    Books_info(String Book_Title,String Genre ,String Author_Name, String Date_Published, int Pages){
        this.Book_Title = Book_Title;
        this.Author_Name = Author_Name;
        this.Date_Published = Date_Published;
        this.Pages = Pages;
        this.Genre = Genre;
    }

    //Getters
    public String getBook_Title(){
        return Book_Title;
    }
    public String Genre(){
        return Genre;
    }
    public String getAuthor_Name(){
        return Author_Name;
    }
    public String getDate_Published(){
        return Date_Published;
    }
    public int getPages(){
        return Pages;
    }

    //Setters
    public void setBook_Title(String Book_Title){
        this.Book_Title = Book_Title;
    }
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    public void setAuthor_Name(String Author_Name){
        this.Author_Name = Author_Name;
    }
    public void setDate_Published(String  Date_Published){
        this.Date_Published = Date_Published;
    }
    public void setPages(int Pages){
        this.Pages = Pages;
    }

    public String toString(){
        return "Book Title: " + Book_Title +
                "\nGenre: " + Genre +
                "\nAuthor Name: " + Author_Name +
                "\nDate Published: " + Date_Published +
                "\nPages: " + Pages;
    }
}
