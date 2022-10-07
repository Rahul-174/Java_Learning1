package com.JavaLearning.javaBasics;

import java.util.Scanner;

public class Java5_Conditionals {

    //DECISION MAKING STATEMENTS  =>
        //1. IF-ELSE
        //2. SWITCH-CASE

    //LOGICAL OPERATORS
        // && , || , !

    public static void main(String[] args) {
        //1. IF-ELSE Conditional statement
            //else block is not compulsory
        int age=16;
        if(age>=18)
            System.out.println("You can drive !!");
        else
            System.out.println("No Boiii , You can't drive");

        //2. Switch-Case
            //Try enhanced switch which donot need break statement

        Scanner sc= new Scanner(System.in);
        int age2=sc.nextInt();
        switch (age){
            case 18:
                System.out.println("Wofff, You are just adult !");
                break;
            case 24:
                System.out.println("You are going to get a job !");
                break;
            default:
                System.out.println("Hello there ! Your age is : "+ age2);
        }


    }
}
