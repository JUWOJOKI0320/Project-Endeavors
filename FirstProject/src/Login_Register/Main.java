package Login_Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Database d = new Database();
        Scanner s = new Scanner(System.in);
        Login l = new Login();
        Register r = new Register();
        while(true){
            System.out.print("Login System\n" +
                    "1. Login\n" +
                    "2. Register\n" +
                    "3. Display Accounts\n" +
                    "4. Exit\n" +
                    "Option 1-4: ");
            int n = Integer.parseInt(s.nextLine());
            if (n == 1) {
                l.LoginUser(s,d);
            } else if (n == 2) {
                r.RegisterUser(s,d);
            } else if (n == 3) {
                //problem is displaying accounts, I don't know if register problem or displaying problem, haven't checked the register
                d.DisplayAccounts();
            } else{
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
