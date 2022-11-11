package com.JavaLearning.OOPs;


/*
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

    =>To access the interface methods, the interface must be "implemented" (kinda like inherited)
        by another class with the implements keyword (instead of extends).
        The body of the interface method is provided by the "implement" class.

    => Like abstract classes, interfaces cannot be used to create objects.
    => Interface methods do not have a body - the body is provided by the "implement" class
    => On implementation of an interface, you must override all of its methods
    => Interface methods are by default abstract and public
    => Interface attributes are by default public, static and final
    => An interface cannot contain a constructor (as it cannot be used to create objects)

              Why And When To Use Interfaces?
              1) To achieve security - hide certain details and only show the important details of an object (interface).

##IMPORTANT## 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
              However, it can be achieved with interfaces, because the class can implement multiple interfaces.
              Note: To implement multiple interfaces, separate them with a comma (see example below).


    NOTE : AN ABSTRACT CLASS MUST HAVE ATLEAST ONE ABSTRACT_METHOD(methods with no body) .....(CAN HAVE NON-ABSTRACT METHODS TOO),
           but..INTERFACES ALL METHODS MUST BE ABSTRACT.

*/

interface Bicycle{

    int a=10; //We can create properties in interface BUT can't modify as they are final by default
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{


    void blowHorn();
    void blowHornAgain();
}

class AvonCycle implements Bicycle , HornBicycle{

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying break "+decrement);
    }

    @Override
     public void speedUp(int increment) {
        System.out.println("applying speedup "+increment);
    }

    @Override
    public void blowHorn() {
        System.out.println("po po po");
    }

    @Override
    public void blowHornAgain() {
        System.out.println("again PO Po");
    }
}


public class Oops9_Interfaces {
    public static void main(String[] args) {
        AvonCycle myObj=new AvonCycle();
        myObj.applyBreak(10);
        myObj.applyBreak(-10);
        System.out.println(myObj.a);
 //       myObj.a=23; // ERROR : b/c Interface attributes are by default public, static and final
                      //              and final attributes can't be changed

        myObj.blowHorn();
        myObj.blowHornAgain();
    }
}
