package com.JavaLearning;

import java.util.Random;
import java.util.Scanner;

public class Java5_Exercise2_ROCK_PAPER_SCISSOR {

//    ROCK PAPER SCISSORS GAME
        /* Rock beats Scissors,
        Scissors beats paper,
        paper beats rock */

    public static void main(String[] args) {
        System.out.println(" 1 -> Rock \n 2 -> Paper \n 3 -> Scissor \n Select your choice : " );
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        Random rn=new Random();
        int x= rn.nextInt(3)+1;
        System.out.println("x : "+x +" choice : "+choice );
        if(x==choice)
            System.out.println("No Winner");
        else if(choice==1 && x==2)
            System.out.println("You Loose !");
        else if(choice==1 && x==3)
            System.out.println("You Win !");
        else if(choice==2 && x==1)
            System.out.println("You Win !");
        else if(choice==2 && x==3)
            System.out.println("You Loose !");
        else if(choice==3 && x==1)
            System.out.println("You loose!");
        else if(choice==3 && x==2)
            System.out.println("You Won !");
    }
}
