package com.company.concepts.javaprojects.concept;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String args[]){
        String str="HELLO hello HEllo Hello HI Hi hi Universe UNIVERSE UniVERSE hi HI hi";
       countDup(str);
        System.out.println("************************************************************");
       countDup("HASH hash HAsh haSH MAp MAP mAP mAp MAp");
        System.out.println("************************************************************");
        countDup("Bread butter and bread");
    }
    public static void countDup(String name) {
        String[] inputName=name.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (String str:inputName) {
            if(hashMap.containsKey(str.toLowerCase())){
                hashMap.put(str.toLowerCase(), hashMap.get(str.toLowerCase())+1);

            }else {
                hashMap.put(str.toLowerCase(),1);
            }
        }
        for (Map.Entry<String,Integer> entry: hashMap.entrySet()) {
            if(entry.getValue()>1)
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
