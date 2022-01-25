package com.company.concepts.javaprojects.concept;
//Write a java program to reverse each word of a given string
//https://seleniumautomationtester.wordpress.com/2017/03/29/java-programs-asked-in-interviews/
public class ReverseEachWordOfString {
    public static void main(String args[]){
        reverseEachWord("Java is a good programming language");
    }
    public static void reverseEachWord(String str){
        String[] words=str.split(" ");
        String reverseString="";
        for(int i=0;i< words.length;i++){
            String word=words[i];
            String reverseWord="";
            for(int j=word.length()-1;j>=0;j--){
                reverseWord=reverseWord+word.charAt(j);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println("Input String is : "+str);
        System.out.println("Reverse String is : "+reverseString);
    }
}
