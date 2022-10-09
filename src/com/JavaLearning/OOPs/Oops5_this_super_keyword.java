package com.JavaLearning.OOPs;

/*
# this Keyword -=> 'this' is a way for us to reference an object of the class which is being created/referred

# super Keyword
    -> A reference variable used to refer immediate parent class
    -> can be used to refer immediate parent class instance variable
    -> can be used to invoke parent class methods
    -> can be used to invoke parent class constructor

 */

class MyClass{
    int a;
    public int getA(){return a;}
    public MyClass(int a){
//        a=a; //it will give error or not work properly
        this.a=a;
    }

    public int returnOne(){return 1;}
}

class AnotherClass extends MyClass{

    public AnotherClass(int c){
        super(c);
        System.out.println("I'm a constructor");
    }
}

public class Oops5_this_super_keyword {
    public static void main(String[] args) {
        MyClass obj=new MyClass(65);
        System.out.println(obj.getA());

        AnotherClass a=new AnotherClass(100);
        System.out.println(a.getA());
    }
}
