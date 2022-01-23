package com.concept;

import java.util.Arrays;

// Write a Java program to find out the first two max values from an array?
public class MaxValue {
    public static void main(String args[]) {
        int[] num = {15, 24, 48, 21, 43, 11, 79, 93};
        getMax(num);
        System.out.println(getArrayMax(num, 7));
        System.out.println(getArrayMax(num, 7, 1));
    }

    public static void getMax(int[] num) {
        int maxOne = 0, maxTwo = 0;
        for (int n : num) {
            if(maxOne<n){
                maxTwo=maxOne;
                maxOne=n;
            }else if(maxTwo<n){
                maxTwo=n;
            }
        }
        System.out.println(maxOne+"  "+maxTwo);
    }

    public static int getArrayMax(int[] num, int total) {
        Arrays.sort(num);
        return num[total];
    }

    public static int getArrayMax(int[] num, int total, int n) {
        Arrays.sort(num);
        return num[total - n];
    }
}
