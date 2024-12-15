package Student_Grading;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner User_input = new Scanner(System.in);
    public static void main(String[] args){
        StudentDatabase database = new StudentDatabase();
        System.out.println("Technological University of the Philippines\n");
        while(true) {
            System.out.println("1. Add Student Info");
            System.out.println("2. Delete Student Info");
            System.out.println("3. Edit Student Info");
            System.out.println("4. Display Student Info");
            System.out.println("5. Register");
            System.out.println("6. Login");
            System.out.println("7. Exit");
            System.out.print("Input 1-7: ");
            int num = User_input.nextInt();
            if (num == 1) {
                new AddStudentRecord(database);
            } else if (num == 2) {

            } else if (num == 3) {

            } else if (num == 4) {
                System.out.print("Username: ");
                String Student_Name = User_input.next();
                StudentRecords record = database.getRecord(Student_Name);
                System.out.println(record.GetStudentName());
                System.out.println(record.GetScienceGrade());
                System.out.println(record.GetEnglishGrade());
                System.out.println(record.GetMathGrade());
            } else if (num == 5) {

            } else if (num == 6) {

            } else{
                break;
            }
        }
    }
}
