package Student_Grading;
import java.util.Scanner;
import java.util.HashMap;

public class AddStudentRecord {
    static Scanner s = new Scanner(System.in);
    StudentDatabase database = new StudentDatabase();

    public AddStudentRecord(StudentDatabase database){
        this.database = database;
        Fillup();
    }
    public void Fillup(){
        System.out.println("Fill Information:");
        System.out.print("Student Name: ");
        String Student_Name = s.nextLine();
        System.out.print("English Grade: ");
        float English_Grade = s.nextFloat();
        System.out.print("Math Grade: ");
        float Math_Grade = s.nextFloat();
        System.out.print("Science Grade: ");
        float Science_Grade = s.nextFloat();
        s.nextLine();
        StudentRecords record = new StudentRecords(Student_Name, Math_Grade,Science_Grade,English_Grade);
        database.addRecord(Student_Name,record);
        System.out.println("\nRecord Added\n");
    }
}

