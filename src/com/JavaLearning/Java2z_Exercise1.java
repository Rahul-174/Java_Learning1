package com.JavaLearning;

import java.util.Scanner;

public class Java2z_Exercise1 {

    //QUESTION : Program to calculate % of a given student . His marks from 5 subjects must be taken as input from Keyboard.
    //NOTE => marks are out of 100

    public static void main(String[] args) {
        System.out.println("Marks will be out of 100");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks of 5 subject");
        float m1,m2,m3,m4,m5;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        float p=(m1+m2+m3+m4+m5)/5;
        System.out.println("Percentage of Student is : " + p);

    }
}
