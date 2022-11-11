package com.JavaLearning.OOPs;

/*

#Java Inheritance

#Constructor in Inheritance :
  => constructor in Derived as well as Base class will invoke
  => First Base class Constructor(Normally Default constructor){it will be like running inside derived class}
     and then Derived class constructor will invoke.
  => If we want to invoke overloaded constructor of Base class(Super Class) we can use 'super' keyword in derived class
  => If we want to invoke overloaded constructor of Derived class,
     it is automatically done based on parameters given during object creation in main method;

*/



class Base{

    //Default Constructor
    public Base() {
        System.out.println("I'm a default constructor in Base class");
    }

    //Overloaded constructor
    public Base(int a){
        System.out.println("I'm a overloaded constructor in Base class with value a: "+ a);
    }

}

class Derived extends  Base{
    public Derived(){
        super(0);
        System.out.println("I'm default constructor in Derived class");
    }


    public Derived(int a,int b) {
        super(a);
        System.out.println("I'm a overloaded constructor in Derived class with value b: "+ b);
    }
}

public class Oops4_Inheritance {
    public static void main(String[] args) {
//        Base b=new Base(); //constructor in base class will be invoked

//        Derived d=new Derived(); //constructor in Derived as well as Base class will invoke
                                 //# First Base class Constructor and then Derived class constructor will invoke

        Derived d1=new Derived(1,2);


    }
}
