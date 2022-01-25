package com.company.concepts.javaprojects.concept;

public class CountChar {
    public static void main(String args[]){
        System.out.println("Number of occurrence of  o is : "+countChar("Helloooooo",'o'));

    }
    public static int countChar(String str,char c){
        int count=str.length()-str.replace("o","").length();
        return count;
    }
}
