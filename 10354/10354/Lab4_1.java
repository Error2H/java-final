import java.util.Scanner; 
public class Lab4_1 { 
 public static void main(String[] args) { 
    int score;
    String grade = ""; 
    Scanner scan = new Scanner(System.in); 
    System.out.println("Program Calculate grade."); 
    System.out.print("Enter student score : "); 
    score = scan.nextInt(); 
    if ((score >= 0) && (score <= 100)) {  
        if (score >=80 && score <= 100) grade = "A"; 
        if (score >=75 && score <=79)   grade = "B+"; 
        if (score >=70 && score <=74)   grade = "B"; 
        if (score >=65 && score <=69)   grade = "C+"; 
        if (score >=60 && score <=64)   grade = "C"; 
        if (score >=55 && score <=59)   grade = "D+"; 
        if (score >=50 && score <=54 )  grade = "D"; 
        if  (score < 50) grade = "F";
        System.out.println("Student gradde is " + grade );  
    }else{ 
        System.out.println("Invalid student score."); 
    } 
        System.out.println("End Program."); 
    } 
} 