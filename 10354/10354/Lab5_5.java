import javax.swing.JOptionPane; 
import java.text.DecimalFormat; 
public class Lab5_5 { 
    public static void main(String[] args) { 
    String menu, choiceStr; 
    boolean done = true; 
    int choice; 
    DecimalFormat fourDigit = new DecimalFormat("0.00"); 
    
    menu = "Main Menu\n 1. Circle \n 2. Rectangle \n 3.Triangle\n 4.semicircle \n 5.Exit";
    do { 
        choiceStr = JOptionPane.showInputDialog(menu); //แสดงข้อความรับมาจาก Menu
        choice = Integer.parseInt(choiceStr);//รับค่าตัวเลขที่รับมาจากchoiceStr และเก็บไว้ใน choice
        if (choice >= 1 && choice <= 5) { 
            if (choice == 1) { 
                String radiusStr; 
                double radius;
                radiusStr = JOptionPane.showInputDialog( "Enter radius :"); 
                radius = Double.parseDouble(radiusStr); 
                JOptionPane.showMessageDialog( null, "Area circle is " + fourDigit.format(area(choice,radius)), 
                "Result", JOptionPane.INFORMATION_MESSAGE ); 
            } 
            else if (choice == 2) { 
                String widthStr, heightStr; 
                double width,height; 
                widthStr = JOptionPane.showInputDialog( "Enter width :"); 
                width = Double.parseDouble(widthStr); 
                heightStr = JOptionPane.showInputDialog( "Enter height :"); 
                height = Double.parseDouble(heightStr); 
                JOptionPane.showMessageDialog( null, "Area rectangle is " + 
                fourDigit.format( area(choice,width, height ) ), "Result", JOptionPane.INFORMATION_MESSAGE ); 
            }
            else if (choice == 3) { 
                String widthStr, heightStr; 
                double width,height; 
                widthStr = JOptionPane.showInputDialog( "Enter width :"); 
                width = Double.parseDouble(widthStr); 
                heightStr = JOptionPane.showInputDialog( "Enter height :"); 
                height = Double.parseDouble(heightStr); 
                JOptionPane.showMessageDialog( null, "Area Triangle is " + 
                fourDigit.format( area(choice,width, height) ), "Result", JOptionPane.INFORMATION_MESSAGE ); 
            } 
            else if (choice == 4) { 
                String radiusStr; 
                double radius; 
                radiusStr = JOptionPane.showInputDialog( "Enter radius :"); 
                radius = Double.parseDouble(radiusStr); 
                JOptionPane.showMessageDialog( null, "Area circle is " + fourDigit.format(area(choice,radius)), 
                "Result", JOptionPane.INFORMATION_MESSAGE ); 
            } 
            else if (choice == 5) done = false; 
        } 
    } 
    while(done); 
        System.exit(0); 
    } 
    
    public static double area(int choice,double r) { 
        if(choice == 1){
            return (Math.PI * r* r); 
        }else{
            return (Math.PI * r* r)/2; 
        }
    } 
    public static double area(int choice, double w, double h) {
        if(choice == 3){
            return (0.5 * w * h); 
        }else{
            return (w * h); 
        }
    }  
}