package com.JavaLearning.javaBasics;

/*
    NOTE :
        #. In case of Arrays , the reference is passed
        #. Same is the case for object passing to methods
*/

public class Java9_Methods {

    //We can call "static" method without creating the object
    static int staticLogicMethod(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }


    public static void main(String[] args) {
        int a=5;
        int b=7;

        //creating object to access method
        Java9_Methods obj=new Java9_Methods();
        int xz=staticLogicMethod(a,b);
        System.out.println(xz);

        //Since we have static method ..... We can call "static" method without creating the object
        System.out.println(staticLogicMethod(a,b));
    }
}
