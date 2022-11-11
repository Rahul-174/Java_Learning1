package com.JavaLearning.OOPs;

/*
ABSTRACT METHOD : A method is declared without an implementation
                    e.g. abstract void moveTO(double x,double y);
ABSTRACT CLASS : If a class contains abstract method then it is abstract class
                 and class Must be declared as Abstract.

          ## IMPORTANT NOTE ##
          1. We can't create object of abstract class
          2. Abstract methods must be implemented in child class
             OR if not child class should be declared as abstract (eventually further child class must implement abstract method)
          3.
*/

abstract class Base2{
    public Base2(){ //constructor
        System.out.println("I'm constructor in Base2");

    }
    public void sayHello(){
        System.out.print("Hello, ");
    }
    abstract public void greet();
}

class Child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

public class Oops8_AbstractClasses {

    public static void main(String[] args) {
        Base2 obj=new Child2();
        obj.sayHello();
        obj.greet();

    }
}
