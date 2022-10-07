package com.JavaLearning.javaBasics;

/*
    Two or more methods can have same name but different parameters,
    and such methods are called overloaded method and this concept is called method overloading

    ## IMPORTANT ##
    Method overloading can not be performed by changing the Return Type

*/

public class Java10_MethodOverloading {

    static void greet(){
        System.out.println("Hi everyone ! Good Morning");
    }
    static void greet(String str){
        System.out.println("Hi everyone ! Good "+str);
    }

    public static void main(String[] args) {
        greet();
        greet("evening");

    }
}
