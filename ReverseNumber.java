package com.concept;

public class ReverseNumber {
    public static int reverseNumber(int num){
        int rev=0,rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println(reverseNumber(123));
    }
}
