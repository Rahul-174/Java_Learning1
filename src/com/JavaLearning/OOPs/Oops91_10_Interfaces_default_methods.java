package com.JavaLearning.OOPs;

/*
    DEFAULT METHODS : We can add default methods in interface with body.
                      It can be overridden in implemented class


 */


interface MyCamera{
    void takeSnap();
    void recordVideo();


    //Interface having default methods with body
    default void record4kVideo(){
        System.out.println("Recording in 4K....");
    };
}

interface MyWifi{
    String[] getNetwork();
    void connectTONetwork(String network);
}


class MyCellPhone {
    void callNumber(int phoneNumber){
        System.out.println("Calling : "+phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }

}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{

    public void takeSnap() {
        System.out.println("Taking snap.");
    }
    public void recordVideo() {
        System.out.println("Recording video");
    }
    public String[] getNetwork() {
        System.out.println("Getting list of networks ");
        String[] networkList={"bsnl","idea","vi"};
        return networkList;
    }

    public void connectTONetwork(String network) {
        System.out.println("connecting to : "+network);
    }

//    //Overriding default method of interface => we can do that
//    public void record4kVideo(){
//        System.out.println("Taking snap and Recording in 4K....");
//    };
}

public class Oops91_10_Interfaces_default_methods {
    public static void main(String[] args) {
        MySmartPhone myObj=new MySmartPhone();
        String[] str=myObj.getNetwork();
        for (String item:str) {
            System.out.println(item);
        }


        myObj.record4kVideo();
    }
}
