public class Lab2_6 {
    public Lab2_6(){
        System.out.println("Create object from Class Information" );
        System.out.println( "Id : 5066269999" );
        System.out.println( "Name : Somchai Cheingpongpan" );
        System.out.println( "Department : Information Technology" );
        System.out.println( "Class : 1RB" );
    }
    public Lab2_6(String id,String name, String Department, String Class){
        System.out.println("Create object from Class Information" );
        System.out.println( "Id         : " +id );
        System.out.println( "Name       : " +name );
        System.out.println( "Department : " +Department );
        System.out.println( "Class      : " +Class);
    }
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        Lab2_6 info = new Lab2_6("6706021410354","Pornmongkon","ITI","RA");
        System.out.println("-------------------------------");
        Lab2_6 inufo =  new Lab2_6();
        System.out.println("-------------------------------");
    }
}
 