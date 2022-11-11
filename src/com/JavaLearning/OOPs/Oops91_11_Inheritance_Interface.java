package com.JavaLearning.OOPs;

/*
      =>  We can inherit one interface to others.
            NOTE : we cannot inherit interface to other class

      =>
 */

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface{

    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}

public class Oops91_11_Inheritance_Interface {
    public static void main(String[] args) {
        MySampleClass myObj=new MySampleClass();
        myObj.meth1();
        myObj.meth2();
        myObj.meth3();
        myObj.meth4();
    }
}
