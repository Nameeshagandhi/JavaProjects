package com.company.concepts.javaprojects.concept;

public class NoOfDigit {
    public static void main(String args[]){
        System.out.println(digitCalc(9011818));

    }
    public static int digitCalc(int num){
        int digit=0;
        if(num<0){
            num=num*-1;

        }
        else if (num==0){
            num=1;
        }
        while(num>0){
            digit++;
            num=num/10;
        }
        return digit;
    }
}
