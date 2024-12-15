package Student_Grading;

import java.util.HashMap;

public class StudentDatabase {
    private HashMap<String, StudentRecords> studentrecords = new HashMap<>();

    //setters
    public void addRecord(String name, StudentRecords  record){
        studentrecords.put(name,record);
    }

    //getters
    public StudentRecords getRecord(String name){
        return studentrecords.get(name);
    }

    public HashMap<String, StudentRecords> getStudentrecords() {
        return studentrecords;
    }

    public void RemoveRecord(String name){
        studentrecords.remove(name);
    }
}

