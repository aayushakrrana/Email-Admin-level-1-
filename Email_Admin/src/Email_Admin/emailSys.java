/**
 *
 * @author AAYUSH_RANA
 */
package Email_Admin;
import java.util.*;

 public class emailSys
{
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String eMail;
    private int mailCapacity = 5000;
     public emailSys(String fname, String lname,int dept)
     {
         firstName=fname;
         lastName=lname;
         department = getDept(dept); 
         
     }
     
    public void generateEmail()
     {  
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome, "+firstName+" "+lastName+"");
        System.out.println("\nGenerating credentials...\n");
        eMail = firstName.toLowerCase()+lastName.toLowerCase()+"_"+department+"@"+"xyz"+".com";
        System.out.println("Email: "+eMail);
        password = setPass();
        System.out.println("Password: "+password);
        System.out.println("--------------------------------------------------");  
     }
     
     private String setPass()
     {
         int length = 8;
         String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"+"@#&$%";
         StringBuilder sb = new StringBuilder(length);
         for (int i = 0; i < length; i++) 
         { 
            int index = (int)(AlphaNumericString.length()* Math.random()); 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
         return sb.toString(); 
     }
     
     public void changePass()
     {
         {  
             Scanner scan = new Scanner(System.in);
             String checkpass;
             System.out.println("Enter old password:");
             checkpass= scan.nextLine();
             if(checkpass.equals(password))
             {
                 System.out.println("Enter new password:");
                 checkpass=scan.nextLine();
                 System.out.println("Re enter new password:");
                 String repass = scan.nextLine();
                 if(checkpass.equals(repass))
                 {
                     password=checkpass;
                     System.out.println("Password successfully changed!!");
                     System.out.println("New password: "+password);
                 }
                 else
                 {
                     System.out.println("Password does not match.");
                 }
                 
             }
             else
             {
                 System.out.println("This password is incorrect.");
             }
         }
    }
     
     public void showPassword()
     {
         System.out.println("Password: "+password);
     }
     
     private String getDept(int dept)
     {
         //Department:\nChoose :-\n1 -> CSE\n2 -> IT\n3 -> ME\n4 -> EI\n 5 -> EN\n6 -> CE\n7 -> MCA 
        if(dept==1) return "CSE";
        else if(dept==2) return "IT";
        else if(dept==3) return "ME";
        else if(dept==4) return "EI";
        else if(dept==5) return "EN";
        else if(dept==6) return "CE";
        else if(dept==7) return "MCA";
        else ;
        return " ";
     }
     
     public void showCapacity()
     {
         System.out.println("Mail box capacity: "+mailCapacity);
     }
     
     public void showInfo()
     {
         System.out.println("--------------------------------------------------");
         System.out.println("- Account Information -"+"\n"+"Name: "+firstName+" "+lastName);
         System.out.println("Email: "+eMail);
         System.out.println("Department: "+department);
         System.out.println("Mail box capacity: "+mailCapacity);
         System.out.println("--------------------------------------------------");
     }
     
}
