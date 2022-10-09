package com.JavaLearning.OOPs;

/*

1. ## ACCESS MODIFIERS ##

FOLLOW THIS LINK TO STUDY IN DETAIL
https://www.javatpoint.com/access-modifiers

i. PRIVATE => The access level of a private modifier is only within the class.
              It cannot be accessed from outside the class.
              #If you make any class constructor private, you cannot create the instance(OBJ) of that class from outside the class.

ii. Default => The access level of a default modifier is only within the package.
               It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
iii. Protected => The access level of a protected modifier is within the package and outside the package through child class.
                  If you do not make the child class, it cannot be accessed from outside the package.
iv. Public => The access level of a public modifier is everywhere.
              It can be accessed from within the class, outside the class, within the package and outside the package


2. ## GETTERS and SETTERS ##
Getter => Returns the value (Accessor)
Setter => Sets/Updates the value (mutator)

*/

class Employee2{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}

public class Oops2_AccessModifiers_Getters_Setters {
    public static void main(String[] args) {
        Employee2 myObj=new Employee2();

//        myObj.id=3;          => ERROR - due to private access modifier , We have to use getter and setter for this
//        myObj.name="Rahul";

        myObj.setId(1);
        myObj.setName("Rahul");
        System.out.println("myObj Details : \n Name - "+myObj.getName()+"\n  ID - "+myObj.getId());


    }
}
