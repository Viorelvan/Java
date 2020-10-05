package com.company.dataTypes;

public class Comparison {

    public static void main(String[] args) {
        String str1 = new String("Hi");
        String str2 = new String("Hi");
        String str3 = new String("Hello");

        String str4 = str1;

        System.out.println("Reference Equality:"); //check link
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

        System.out.println("\nLogical Equality:"); //check value
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

    }



}
