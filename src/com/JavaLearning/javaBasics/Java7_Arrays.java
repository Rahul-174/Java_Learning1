package com.JavaLearning.javaBasics;

public class Java7_Arrays {
    public static void main(String[] args) {
        /*
            classroom of 5 students - you have to store marks of each student
            You have two options
            1. create 5 variables
            2. Use arrays(Efficient ways)
        */


//        int[] marks =new int[5];
//        marks[0]=57;
//        marks[1]=78;
//        marks[2]=79;
//        marks[3]=90;
//        marks[4]=98;
        int[] marks={57,78,79,90,98};
        System.out.println(marks[3]);




        //Multidimensional Arrays
        //2-D

        int[][] flat=new int[2][3];
        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=201;
        flat[1][1]=202;
        flat[1][2]=203;

        for(int i=0;i< flat.length;i++)
        {
            for(int j=0;j<flat[0].length;j++)
            {
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }




    }
}
