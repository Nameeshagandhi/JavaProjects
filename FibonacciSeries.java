package com.company.concepts.javaprojects.concept;

public class FibonacciSeries {
    public static void main(String args[]) {
        fact(7);
    }

    public static void fact(int num) {
        int next, first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i < num; i++) {
            // System.out.print(first+"  ");
            next = first + second;
            System.out.print(" " + next + " ");
            first = second;
            second = next;
        }
    }
}
