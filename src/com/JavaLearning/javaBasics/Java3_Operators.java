package com.JavaLearning.javaBasics;


//1. Operators, types of operators in Java
//2. Associativity of operators


//1. TYPES OF OPERATORS
    //Arithmetic -> +,-,*,/,%,++,--
    //Assignment -> =,+=, etc
    //Comparison -> ==,>=,<=
    // Logical -> &&, || ,!
    // Bitwise -> &, |

//2. Associativity of operators
    /*
       int a=6*5-35/2
            =30-34/2
            =30-17
            =13
       int b=60/5-34*2
            =12-34*2
            =12-68
            =-56
                                     NOTE : / & * have same precedence so associativity will be left to right
                                            Associativity for : * , / => L to R
                                                                + , _ => L to R
                                                                ++ , = => R to L
    */
public class Java3_Operators {
    public static void main(String[] args) {
//        int a=5;
//        int b=6*a;
//        System.out.println(b);
//
//        System.out.println(2&3); //bitwise operator -> 2=>10 , 3=>11 =>2&3=>10=2

        char c='B';
        System.out.println((char)(c+2));


    }
}
