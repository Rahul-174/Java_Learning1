package com.JavaLearning.javaBasics;

//while
//do-while
//for
//break , continue statements


/*
Q1. Using for loop print foll star pattern
        *****
        ****
        ***
        **
        *

Q2. Program to find sum of first n even numbers using while loop
*/

public class Java6_Loops {
    public static void main(String[] args) {

    //Q1 => solution
/*      int n=5;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
*/

    //Q2 => solution
       int n=10;
       int sum=0;
       int i=1;
       while(n>0){
           sum+=i*2;
           i++;
           n--;
       }
        System.out.println("Sum of first n(here n=10) even numbers is : "+sum);



    }
}
