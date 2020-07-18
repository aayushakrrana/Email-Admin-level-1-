/**
 *
 * @author AAYUSH_RANA
 */
package Email_Admin;
//import Email_Admin.emailSys;
import java.util.*;

class Email_Admin
{
    public static void main(String args[])
    {   Scanner scan = new Scanner(System.in);
        System.out.println("--- Welcome to Email Administrator ---");
        System.out.println("Please input values corresponding to fields:");
        System.out.println("First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Last Name : ");
        String lastName = scan.nextLine();
        System.out.println("Department:\nChoose :-\n1 -> CSE\n2 -> IT\n3 -> ME\n4 -> EI\n5 -> EN\n6 -> CE\n7 -> MCA ");
        int dept = Integer.parseInt(scan.nextLine());
        if(dept<1 || dept>7)
        {
            System.out.println("Invalid Choice:\nTry Again!!");
            System.exit(1);
        }
        System.out.println("Type 'OK' to confirm.");
        String confirm = scan.nextLine();
        if(confirm.equals("OK") || confirm.equals("ok"))
        {
            emailSys e = new emailSys(firstName,lastName,dept);
            e.generateEmail();
            String ch="Y";
            while(ch.equals("Y") || ch.equals("y"))
            {
                System.out.println("Choose option :-\n1 -> Show Information\n2 -> Show Password\n3 -> Change Password\n4 -> Show Mail box capacity ");
                int option = Integer.parseInt(scan.nextLine());
                if(option<1 || option>4)
                {
                    System.out.println("Invalid Choice:\nTry Again!!");
                    System.exit(1);
                }

                if(option ==1) e.showInfo();
                else if(option ==2) e.showPassword();
                else if(option ==3) e.changePass();
                else e.showCapacity();
                System.out.println("--------------------------------------------------");
                System.out.println("Press 'Y' to perform another operation... ");
                ch = scan.nextLine();
            }
            
        }
        else
        {
            System.out.println("------ Process Terminated!! -----");
            System.exit(1);
        }
        
        
        
        
    }
}