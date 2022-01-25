package com.company.concepts.javaprojects.concept;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
       return fact;
    }
    public static void main(String args[]) {
        System.out.println("Enter the number to find the factorial : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Factorial of "+num+" : "+factorial(num));
        System.out.println("Factorial of "+num+" : "+factorialFor(num));
    }
    public static int factorialFor(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
