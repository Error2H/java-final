import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int start,end,sum;
        System.out.print("Enter Formula : "); 
        start = scan.nextInt();
        end = scan.nextInt();
        if(start < end){
            for(int i=start; i <=end; i++){
                System.out.println("=====================");
                System.out.println("      Formula "+i);
                System.out.println("=====================");
                for(int x=1 ; x <=12; x++){
                    sum = i * x ;
                    System.out.println(+i+" x "+x+" = "+sum);
                } 
            }
        }else{
            for(int i=start; i >= end; i--){
                System.out.println("=====================");
                System.out.println("      Formula "+i);
                System.out.println("=====================");
                for(int x=1 ; x <=12; x++){
                    sum = i * x ;
                    System.out.println(+i+" x "+x+" = "+sum);
                } 
            }
        }
        System.out.println("=====================");
        System.out.println("End Program....");
        scan.close();
    }
}