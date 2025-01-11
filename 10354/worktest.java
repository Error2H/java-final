import java.util.Scanner;

import javax.swing.JOptionPane;
public class worktest {
    public static void main(String[] args) {
            String order = " ";
            int total = 0;
            String bill = "Your Order : \n";
            String detail = ":";
            Scanner scan = new Scanner(System.in); 
            int cashback = 0;
            do{ 
                order = JOptionPane.showInputDialog(null,"Select Your Beerage Order : \n" + 
                                        " [P] [PEPSI] 15 \n" + //
                                        " [F] [FANTA] red 13 \n" + //
                                        " [C] Go [Coffee] 25 \n" + //
                                        " [S] [Sprite] 20 \n" + //
                                        " [M] [Mineral] Water 18 \n" + //
                                        " [0] End Order \n" + //
                                        " [Exit]","test",1);
                if(order.equals("0")){
                        bill += "Total" +detail+ " = " + total;
                        JOptionPane.showInputDialog(null,bill+" \n Enter Money : ");
                        int Money = scan.nextInt(); 
                        cashback = Money-total;
                        System.out.println("Remain "+ Money+ "-"+total +" = "+cashback);
                        System.out.println("Thank you....");
                }else{
                    String[] words = order.split(" ");
                    for(String word : words){
                    System.out.println(word);
                }
                    if(words[0].equals("Pepsi")){
                        int price = 15;
                        int qty = Integer.parseInt(words[1]);
                        int unit = price*qty;
                        total += unit;
                        bill += "Pepsi 15 x "+qty+" = " +unit +"\n";
                        if(detail.equals(":")){
                            detail += unit;
                        }else{
                            detail += "+"+unit;
                        }
                    }else if(words[0].equals("Fanta")){
                        int price = 13;
                        int qty = Integer.parseInt(words[1]);
                        int unit = price*qty;
                        total += unit;
                        bill += "Fanta 13 x "+qty+" = " +unit +"\n";
                        if(detail.equals(":")){
                            detail += unit;
                        }else{
                            detail += "+"+unit;
                        }
                    }else if(words[0].equals("Coffee")){
                        int price = 25;
                        int qty = Integer.parseInt(words[1]);
                        int unit = price*qty;
                        total += unit;
                        bill += "Coffee 15 x "+qty+" = " +unit +"\n";
                        if(detail.equals(":")){
                            detail += unit;
                        }else{
                            detail += "+"+unit;
                        }
                    }else if(words[0].equals("Sprite")){
                        int price = 20;
                        int qty = Integer.parseInt(words[1]);
                        int unit = price*qty;
                        total += unit;
                        bill += "Pepsi 20 x "+qty+" = " +unit +"\n";
                        if(detail.equals(":")){
                            detail += unit;
                        }else{
                            detail += "+"+unit;
                        }
                    }else if(words[0].equals("Mineral")){
                        int price = 18;
                        int qty = Integer.parseInt(words[1]);
                        int unit = price*qty;
                        total += unit;
                        bill += "Mineral 18 x "+qty+" = " +unit +"\n";
                        if(detail.equals(":")){
                            detail += unit;
                        }else{
                            detail += "+"+unit;
                        }
                    }
                }
                if(order.equals("Exit")){break;}
            }while(true);
    }
}
