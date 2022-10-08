package com.JavaLearning.OOPs;

/*

OBJECT => An Object is an instantiation  of a Class.
          when a class is defined a template is defined, Memory is allocation Only after Object instantiation.

ABSTRACTION => Hiding internal details
ENCAPSULATION => Act of putting various components together. (Data Binding).
INHERITANCE => Act of deriving new things from existing thing
POLYMORPHISM => One entity many form

*/

// #### In One Java Class there can be only one Public Java CLASS  ####

class Employee{
    int id;
    String name;

    public void introduction(){
        System.out.println("Hello, My name is "+name);
    }
}

public class Oops1_JavaClass {
    public static void main(String[] args) {
        Employee myObj=new Employee();
        //Setting Attributes
        myObj.id=1;
        myObj.name="Rahul";

        //Printing Attributes
        System.out.println("ID : "+myObj.id );
        System.out.println("Name : "+myObj.name);

        //Fetching method of Employee class with an object of Employee class
        myObj.introduction();
    }
}
