package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

       //Declare variable i
        int i = 10;

        //Create for loop
        for (i = 10; i >= 1 ; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }

        //Get system to print Launch at the end of the for loop
        System.out.println("Launch");






    }
}
