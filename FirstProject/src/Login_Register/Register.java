package Login_Register;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Register{
    public void RegisterUser(Scanner s, Database d){
        System.out.println("Register");
        System.out.print("Username: "); String username = s.nextLine();
        System.out.print("Password: "); String password = s.nextLine();
        System.out.print("Employee Name: "); String name = s.nextLine();
        System.out.print("Employee ID: "); String id = s.nextLine();
        d.addDatabase(username, new Database(username, password, name, id));
    }
}
