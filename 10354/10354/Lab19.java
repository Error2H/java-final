import java.util.Scanner;
public class Lab19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int x, y, m, n, total_x = 0, total_y = 0;
        System.out.print("Enter wood stick : "); 
        x = scan.nextInt();
        System.out.print("Enter wood slide : ");
        y = scan.nextInt();
        while (true) {
            System.out.print("Enter Order Big Table   : "); 
            m = scan.nextInt();
            System.out.print("Enter Order Small Table : ");
            n = scan.nextInt();
            if (m > 0 && n > 0) {
                total_x = (m*2)+(n*1);
                total_y = (m*6)+(n*4); 
                if (x >= total_x && y >= total_y) {
                    System.out.println("Yes " + "wood stick : " + (x - total_x) + " wood slide : " + (y - total_y));
                } else {
                    System.out.println("No " + "wood stick : " + (total_x - x) + " wood slide : " + (total_y - y));
                }
                break; 
            } else {
                System.out.println("Plase Enter Again...");
            }
        }
        scan.close();
    }
}
