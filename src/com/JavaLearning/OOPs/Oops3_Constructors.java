package com.JavaLearning.OOPs;

/*
   ## CONSTRUCTOR
   -> A member function used to initialize  an object while creating it;
   -> In order to create our own constructor , we define a method "WITH SAME NAME AS CLASS NAME"
   -> A Constructor must have no explicit return type
   -> A Java constructor cannot be abstract, static, final, and synchronized

   Constructor Overloading
   ->Constructors can be overloaded just like other methods in java.
        object will be initialized with constructor based on parameters given

   ->Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
     They are arranged in a way that each constructor performs a different task.
     They are differentiated by the compiler by the number of parameters in the list and their types.
*/

class Employee3{
    private int id;
    private String name;

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    //creating constructor
    public Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //Constructor Overloading
    public Employee3(){
        this.id=0;
        this.name="Default Name";
    }
}

public class Oops3_Constructors {
    public static void main(String[] args) {
//        Employee3 myObj=new Employee3();
//        myObj.setId(1);
//        myObj.setName("Rahul");

        Employee3 emp=new Employee3(1,"Rahul"); //initializing object while creating it
        System.out.println("ID : "+emp.getId()+"\nName : "+emp.getName());

        Employee3 empDefault=new Employee3();
        System.out.println("\n\nID : "+empDefault.getId()+"\nName : "+empDefault.getName());
    }
}
