package com.JavaLearning.OOPs;


class Employee1{
    int salary;
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String name;
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name=n;
    }
}

public class Oops1_JavaClass_PracticeQ {
    public static void main(String[] args) {

        //Creating object for Devesh
        Employee1 deveshObj=new Employee1();
        //setting attributes without setter(method)
        deveshObj.name="Devesh";
        deveshObj.salary=20000;
        System.out.println("This is "+deveshObj.getName() + ", and salary is : "+deveshObj.getSalary());

        //Creating object for Rahul
        Employee1 rahulObj=new Employee1();
        rahulObj.setName("Rahul");
        rahulObj.setSalary(5000);
        System.out.println("This is "+rahulObj.getName() + ", and salary is : "+rahulObj.getSalary());


    }
}
