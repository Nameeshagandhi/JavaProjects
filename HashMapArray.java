package com.concept;

import io.cucumber.java.sl.In;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapArray {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 1, 2, 3, 5, 10, 9, 11};
        arrayDup(a);
        System.out.println("*******************************************");
        arrayListDup(a);
        System.out.println("*******************************************");
        ArrayListDup(a);
    }

    public static void arrayDup(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer i : arr) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);

            } else {
                hashMap.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void arrayListDup(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void ArrayListDup(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i :
                arr) {
            list.add(i);
        }
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
    }
}
