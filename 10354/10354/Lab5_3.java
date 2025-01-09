import javax.swing.JOptionPane; 
public class Lab5_3 { 
    public static void main(String[] args) { 
        double value; 
        double number1, number2;
        String output = ""; 
        number1 = Double.parseDouble(JOptionPane.showInputDialog( "Enter Number first." )); 
        number2 = Double.parseDouble(JOptionPane.showInputDialog( "Enter Number End." )); 
        for ( int counter = 1; counter <= 20; counter++ ) { //สุ่มจำนวน20รอบ
            value = number1 + (int)( Math.random() * ((number2)-number1+1)); 
            output += value + " ";
                if ( counter % 5 == 0 ) //แถวละ
                output += "\n"; 
        } 
        JOptionPane.showMessageDialog( null, 
                                    output,"20 Count Random Numbers from "+number1+" to "+number2, 
        JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
        } 
}