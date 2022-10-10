package com.JavaLearning.OOPs;

/*
    If the child class implements the same method present in the parent class again, it is known as METHOD OVERRIDING

    => When an object of subclass is created and overridden method is called,
        the method which has been implemented in the subclass is called and its code is executed.
*/

class A{
    public int a;

    public int method1(){
        return 1;
    }

    public void method2(){
        System.out.println("I'm method2 of class A.");
    }
}

class B extends A{
    public void method3(){
        System.out.println("I'm method 3 of class B");
    }

    @Override  //This is an Annotation denoting overriding {Not compulsory but recommended to be safe from unwanted error situation}
    public void method2(){   //we are overriding method2 of class A
        System.out.println("I'm method2 of class B, [overridden method]");
    }
}


public class Oops6_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b=new B();
        b.method2();
    }
}
