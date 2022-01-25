package com.company.concepts.javaprojects.concept;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String args[]) {
        System.out.println(countWords("One two       three\n four\tfive "));
        System.out.println("************************************************************");
        countDup("One two       three\n four\tfive");
        System.out.println("************************************************************");
        countDup("HASH hash HAsh haSH MAp MAP mAP mAp MAp");
        System.out.println("************************************************************");
        countDup("Bread butter and bread");
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty())
            return 0;
        String[] n = str.split("\\s+");
        return n.length;
    }

    public static void countDup(String name) {
        String[] inputName = name.split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : inputName) {
            if (hashMap.containsKey(str.toLowerCase())) {
                hashMap.put(str.toLowerCase(), hashMap.get(str.toLowerCase()) + 1);

            } else {
                hashMap.put(str.toLowerCase(), 1);
            }
        }
        int sum=0;
        for (Integer s: hashMap.values()) {
            sum+=s;
        }
        System.out.println("word count : "+sum);
    }
}
