package com.concept;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapString {
    public static void main(String args[]) {
      String str[]={"a","a","b","b","c","d","d","e"};
        calculate(new String[]{"a","a","b","b","c","c","c","d","d","e","e","e","a"});
       calculate(str);
    }
    public static void calculate(String[] str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : str) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        System.out.println("************************************");
        System.out.println(hashMap.entrySet());
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("************************************");
        for (String s: hashMap.keySet()) {
            System.out.println(s+" "+hashMap.get(s));
        }
        System.out.println("************************************");
        Iterator itr=hashMap.keySet().iterator();
        while (itr.hasNext()){
            String key= (String) itr.next();
            System.out.println(key+" "+hashMap.get(key));
        }
        System.out.println("************************************");
        Iterator iterator=hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry= (Map.Entry<String, Integer>) iterator.next();
            System.out.println(entry.getKey()+ " "+entry.getValue());

        }
    }
}
