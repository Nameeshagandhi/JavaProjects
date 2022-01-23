package com.concept;

public class StringReverse {
    public static void main(String[] args){
        String str="Nameesha";
        System.out.println("Input String is : "+str);
        System.out.println("Reversed String is : "+reverse(str));
        System.out.println("Reversed String is : "+rev(str));

    }
    public  static  String reverse(String str){
        String rev=" ";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static String rev(String str){
        String rev="";
        for (int i=0;i<=str.length()-1;i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
}
