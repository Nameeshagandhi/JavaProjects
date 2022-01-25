package com.company.concepts.javaprojects.concept;

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {
    public static void main(String args[]){
        countChar("All is well");
        countChar("Learn Java Programming");

    }
    public static void countChar(String str){
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (Character c: ch) {
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }else {
                hashMap.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: hashMap.entrySet()) {
            if(entry.getValue()>1)
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
