package Testing;

import java.util.ArrayList;

public class Student {
    String Sname;
    int Sage;

    Student(String Sname, int Sage){
        this.Sname = Sname;
        this.Sage = Sage;
    }

    public void addStudent(ArrayList<Student> student, String Name, int Sage){
        student.add(new Student(Name,Sage));
        System.out.println("Record Added");
    }
    public void displayStudent(ArrayList<Student> student, String Student_name){
        for(Student stud: student){
            if(stud.Sname.equalsIgnoreCase(Student_name)){
            System.out.println(stud.Sname + stud.Sage);
            }
        }
    }
    public void updateStudent(ArrayList<Student> student, String Student_name,String NewStudentName, int NewStudentAge){
        int i=0;
        while(i<1){
            Student stud = student.get(i);
            if(stud.Sname.equalsIgnoreCase(Student_name)){
                student.set(i,new Student(NewStudentName,NewStudentAge));
                break;
            }
            i++;
        }
    }
    public void deleteStudent(ArrayList<Student> student, String Student_name){
        int i=0;
        for(Student s: student){
            if(s.Sname.equalsIgnoreCase(Student_name)){
                student.remove(i);
            }
            i++;
        }
    }

    public void displayStudentRecords(ArrayList<Student> student){
        for(Student s: student){
            System.out.println("Student name: "+s.Sname +" Student Age: "+ s.Sage+"\n");
        }
    }
}
