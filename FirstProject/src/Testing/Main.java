package Testing;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> student = new ArrayList<>();
    public static ArrayList<String> std = new ArrayList<>();
    public static Student stud = new Student("",0);
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Student Record");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Records");
            System.out.println("6. Exit");
            System.out.print("Choose 1-6: ");
            int n = s.nextInt(); s.nextLine();
            if(n==1){
                addRecord();
            }
            else if(n==2){
                displayRecord();
            }
            else if(n==3){
                updateRecord();
            }
            else if(n==4){
                deleteRecord();
            }
            else if(n==5){
                displayStudentRecords();
            }
            else{
                break;
            }
        }

    }

    static void addRecord(){
        System.out.println("Add Record");
        System.out.print("Student Name: ");
        String Student_name = s.nextLine();
        System.out.print("Student Age: ");
        int Student_age = s.nextInt();s.nextLine();
        stud.addStudent(student, Student_name,Student_age);
    }
    static void displayRecord(){
        System.out.println("Display Record");
        System.out.print("Student Name: ");
        String Student_name = s.nextLine();
        stud.displayStudent(student, Student_name);
    }
    static void updateRecord(){
        System.out.println("Update Record");
        System.out.print("Student Name to be updated: ");
        String Student_name = s.nextLine();
        System.out.print("New Student Name: ");
        String NewStudent_name = s.nextLine();
        System.out.print("New Student Age: ");
        int Student_age = s.nextInt();s.nextLine();
        stud.updateStudent(student, Student_name,NewStudent_name,Student_age);
    }
    static void deleteRecord(){
        System.out.println("Update Record");
        System.out.print("Student Name to be deleted: ");
        String Student_name = s.nextLine();
        stud.deleteStudent(student, Student_name);
    }
    static void displayStudentRecords(){
        System.out.println("Display all records");
        stud.displayStudentRecords(student);
    }
}
