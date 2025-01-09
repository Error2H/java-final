public class Lab5_6 {
        public static void main(String[] args) {
            int n = 7; //กำหนดขนาดแถว
            for (int i = 1; i <= n; i += 2) {  //วนเพื่อหาค่า ในช่วงที่เพิ่มขึ้น 
                for (int j = i; j < n; j += 2) { //วนเพื่อหาค่าช่องว่าง
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) { //วนเพื่อแสดงดาว
                    System.out.print("*");
                }
                System.out.println();
            }
            
            for (int i = n - 2; i >= 1; i -= 2) { //วนเพื่อหาค่า ในช่วงที่ลดลง
                for (int j = n; j > i; j -= 2) { //วนเพื่อหาค่าช่องว่าง
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) { //วนเพื่อแสดงดาว 
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }    
        /* 
                   *
                  ***
                 *****
                *******
                 *****
                  *** 
                   *       
        */  
              