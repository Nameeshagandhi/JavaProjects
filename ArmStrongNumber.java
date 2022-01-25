package com.company.concepts.javaprojects.concept;

public class ArmStrongNumber {
    public static void main(String args[]) {
        System.out.println(isArmStrong(1634));
    }
    public static boolean isArmStrong(int n){
        int temp=n,digit=0,last=0,sum=0,originalNum=n;
        while(temp>0){
            digit++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(originalNum==sum)
            return true;
        else
        return false;
    }
}