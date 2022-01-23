package com.concept;
// Write Java code to swap two numbers without using a temporary variable?
public class SwapNumber {
    public static void main(String args[]){
        swapNum(7,8);
    }
    public static void swapNum(int a,int b){
        System.out.println("Before Swapping");
        System.out.println("a = "+a+" b ="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("a = "+a+" b ="+b);


    }

}
