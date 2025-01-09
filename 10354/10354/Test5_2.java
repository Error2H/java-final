import javax.swing.JOptionPane; 
public class Test5_2 { 
    public static void main(String[] args) { 
        double number1, number2, number3; 
        String s1, s2, s3; 
        String output; 
        s1 = JOptionPane.showInputDialog( "Enter first floating-point value" ); 
        s2 = JOptionPane.showInputDialog( "Enter second floating-point value" ); 
        s3 = JOptionPane.showInputDialog( "Enter third floating-point value" ); 
        number1 = Double.parseDouble( s1 ); 
        number2 = Double.parseDouble( s2 );
        number3 = Double.parseDouble( s3 ); 
    
        double max = maximum( number1, number2, number3 ); 
        double min = minimum( number1, number2, number3 ); 
        output = "number1: " + number1 + "\nnumber2: " + number2 ; 
        output += "\nnumber3: " + number3 + "\nmaximum is: " + max; 
        output += "\nminimum is: " + min; 
        JOptionPane.showMessageDialog( null, output); 
        System.exit(0);
    } 

    public static double maximum( double x, double y, double z ) { 
        return Math.max( x, Math.max( y, z ) ); 
    } 
    public static double minimum( double x, double y, double z ) { 
        return Math.min( x, Math.min( y, z ) ); 
    } 
}