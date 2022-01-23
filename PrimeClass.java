package com.concept;

import java.util.Scanner;

public class PrimeClass {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an int value : ");
        int input=scanner.nextInt();
        if (checkPrime(input))
        {
            System.out.println(input+ " is a Prime Number");
        }
        else {
            System.out.println(input+ "is not a Prime Number");
        }
    }
    public static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
