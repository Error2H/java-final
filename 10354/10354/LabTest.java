import java.util.Scanner;
public class LabTest{ 
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num,num1,num2,num3,num4,num5,sum;        
        System.out.print("Enter Number : ");
        num = scan.nextInt();
        num1 = (num/10000)%10;
        num2 = (num/1000)%10;
        num3 = (num/100)%10;
        num4 = (num/10)%10;
        num5 = (num/1)%10;
        sum = num1+num2+num3+num4+num5;
        System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+"+"+"+"+num5+" = "+sum);
        if(sum > 10){
            System.out.println(sum+" > "+"10 is True");
            if(sum % 2 == 0){
                System.out.println(sum +" = even");
            }else{
                System.out.println(sum +" = odd");
            }
        }else{
            System.out.println(sum+" > "+"10 is Flase");
            if(sum % 2 == 0){
                System.out.println(sum +" = even");
            }else{
                System.out.println(sum +" = odd");
            }
            
        }
    }
}