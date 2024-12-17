package Login_Register;

import java.util.Scanner;

public class Login{
    public void LoginUser(Scanner s, Database d){
        System.out.println("Login User");
        System.out.print("Username: "); String username = s.nextLine();
        System.out.print("Password: "); String password = s.nextLine();
        d.LoginDatabase(username,password);
    }
}
