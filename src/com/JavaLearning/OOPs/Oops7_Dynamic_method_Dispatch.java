package com.JavaLearning.OOPs;

class Phone {
    public void name(){
        System.out.println("My name is Java in class One.");
    }

    public void greet() {
        System.out.println("Good Morning !");
    }
}
class Smartphone extends Phone {

    @Override
    public void name(){
        System.out.println("My name is Java in Class Two.");
    }
    public void swagat(){
        System.out.println("Apka Swagat hai");
    }
}

public class Oops7_Dynamic_method_Dispatch {
    public static void main(String[] args) {
//        Phone pObj=new Phone(); //allowed

//        Smartphone sObj=new Smartphone(); //allowed



        //IT WILL GIVE ERROR
//        Smartphone myObj2=new Phone(); //=>NOT ALLOWED b/c => reference is of subClass and object is of superclass


        Phone myObj=new Smartphone(); //reference (i.e. Phone is of super class & object is of Subclass) =>ALLOWED
        myObj.name(); //RUN AND CHECK WHOSE name METHOD IS EXECUTED

    }
}
