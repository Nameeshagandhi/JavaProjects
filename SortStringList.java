package com.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write code to sort the list of strings using Java collection?
public class SortStringList {
    public static void sortString(String[] str){
        ArrayList<String> arrayList1=new ArrayList<>(Arrays.asList(str));
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
    }
    public static void sortProgram(String[] str){
        Arrays.sort(str);
    }
    public static void sortCaseSensitive(String[] str){
        Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
    }
    public static void showList(String[] array){
        for (String str: array) {
            System.out.print(str+" ");
        }
        System.out.println();
    }
    public static void sortList(String[] str){
        ArrayList<String> arrayList=new ArrayList<>();
        for (String s: str) {
            arrayList.add(s);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void main(String args[]) {
        String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec" };
        showList(inputList);
        sortProgram(inputList);
        showList(inputList);
        sortCaseSensitive(inputList);
        showList(inputList);
        sortString(inputList);
        sortList(inputList);
    }
}
