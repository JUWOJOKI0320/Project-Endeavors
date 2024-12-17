package Login_Register;

import javax.xml.crypto.Data;
import java.util.HashMap;

public class Database {
    private HashMap<String, Database> db = new HashMap<>();
    private String username, password;
    private String EmployeeName, EmployeeID;

    Database(){

    }

    Database(String username, String password, String EmployeeName, String EmployeeID){
        this.username = username;
        this.password = password;
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
    }

    public void addDatabase(String username, Database database){
        db.put(username,database);
        System.out.println(db.size());
    }

    public void LoginDatabase(String username, String password){
        if(db.containsKey(username)){
            Database data = db.get(username);
            if(data.getPassword().equalsIgnoreCase(password)){
                System.out.println("Account Infos:\n "+ data);
                System.out.println("Login Successful!");
            }
        }
    }

    public HashMap<String, Database> getDb() {
        return db;
    }

    public void setDb(HashMap<String, Database> db) {
        this.db = db;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public void DisplayAccounts(){
        for(String key : db.keySet()){
            System.out.println("Key: " + key +
                    "\nValue:\n" + db.get(key));
        }
    }

    @Override
    public String toString(){
        return  "\nUsername: " + username +
                "\nPassword: " + password +
                "\nEmployee Name: " + EmployeeName +
                "\nEmployee ID: " + EmployeeID;
    }
}
