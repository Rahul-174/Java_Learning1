package com.JavaLearning.javaBasics;

public class Java11_Variable_Arguments {

/*
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
 */

    //we can add more arguments int this which will be compulsory element
    static int sum(int ...arr){
        // this arr will behave as => int[] arr;
        int sum=0;
        for (int ele:arr) {
            sum+=ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2,3 is : "+sum(2,3));
        System.out.println("sum of 2,3,4 is : "+sum(2,3,4));
        System.out.println("sum of 2,3,4,5 is : "+sum(2,3,4,5));
    }
}
