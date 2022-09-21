package com.JavaLearning;

import java.util.Scanner;

public class Java2_UserInput {

    //java has scanner class in order to read the data
    //Scanner sc=new Scanner(System.in) =>System.in means we  want to read from keyboard
    // int a=sc.nextInt(); => Java takes input default as String so if we want to take input as int ->we have to define that(here we did with nextInt())

    public static void main(String[] args){
        System.out.println("Taking input from the user : ");

        Scanner sc= new Scanner(System.in);

        //taking Integer Input
        System.out.println("Enter first number !");
        int a=sc.nextInt();
        System.out.println("first number is  : " + a);

        //taking String input (Single string)
        System.out.println("Enter Name (Single string)! ");
        String name=sc.next();
        System.out.println("Name (single string) : "+name);

        //taking String Line input
        System.out.println("Enter Address (String) ! ");
        String address=sc.nextLine();
        System.out.println("Address : "+address);

        //hasNextInt() =>to validate if input is int or not =>can use similarly for others ->hasNextFloat(), etc
        System.out.println("Enter an integer value :");
        boolean b1=sc.hasNextInt();
        System.out.println("Is input an Integer ? : "+b1);

    }
}
