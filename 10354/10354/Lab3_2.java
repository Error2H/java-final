public class Lab3_2 { 
    long id;
    String name; 
    String surName; 
    int age; 
    /** Creates a new instance of Lab3_2 */ 
    public Lab3_2() { 
        id = 6706021410354L;
        name = "Somchai"; 
        surName = "Cheingpongpan"; 
        age = 24; 
    } 

    public Lab3_2(long id) { 
        this.id = id;
        this.name = ""; 
        this.surName = ""; 
        this.age = 0; 
    } 

    public Lab3_2(long id,String Name,String Surname) { 
        this.id = id;
        this.name = Name; 
        this.surName = Surname; 
        this.age = 0; 
    } 

    public Lab3_2(long id,String Name,String Surname,int Age) { 
        this.id = id;
        this.name = Name; 
        this.surName = Surname; 
        this.age = Age; 
    } 
    
    public static void main(String[] args) { 
        Lab3_2 person;     
        String value; 
        person = new Lab3_2(); 
        value = person.name + " " + person.surName; 
        value += ", " + person.age + " year old."; 
        System.out.println("ID : " + person.id); 
        System.out.println("Data person : " + value); 
        System.out.println("==============================="); 
        person.name = "John"; 
        person.surName = "Smith"; 
        person.age = 29; 
        value = person.name + " " + person.surName; 
        value += ", " + person.age + " year old."; 
        System.out.println("ID : " + person.id); 
        System.out.println("New data person : " + value); 
    } 
}