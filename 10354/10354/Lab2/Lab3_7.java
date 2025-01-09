import java.util.Scanner; 
public class Lab3_7 { 
 public static void main(String[] args) { 
        String message; 
        // create instance variable 
        Scanner scan = new Scanner (System.in); 
        System.out.print("Enter your name : "); 
        // get data from keyboard 
        message = scan.nextLine(); 
        System.out.println("You entered : \"" + message + " \""); 
        scan.close();
    } 
}