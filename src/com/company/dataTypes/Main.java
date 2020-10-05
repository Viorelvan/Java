package com.company.dataTypes;

public class Main {

    public static void main(String[] args) {

        //widering
//        int a = 10;
//        long b = a;
//        float c = b;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        //narrowing
//        double d = 10;
//        int i = (int) d;
//        System.out.println(d);
//        System.out.println(i);

        //boxing
        long p = 5;
        Long P = Long.valueOf(p);

        //unboxing
//        Double D = 1.5;
//        double d = D;
//        System.out.println(d);

        //String / Char
//        System.out.print("H" + "E" + "L");
//        System.out.print('L' + 'O');


        //--------//--------//
//        System.out.print("H" + "E" + "L");
//        System.out.print('L');
//        System.out.print('O');

        //byte -> char
        //1. byte -> int, int -> char

        //StringBuffer & StringBuilder !!!

        //int -> String
//        int a = 123456;
//        int b = -123456;
//        String s1 = Integer.toString(a);
//        String s2 = Integer.toString(b);
//
//        String s3 = String.valueOf(a);
//        System.out.println(s1);
//        System.out.println(s2);

        //String -> int
        //!!!

        //hashCode() & equals()
        Intern intern1 = new Intern("JOhn Doe", 25, "Java");
        Intern intern2 = new Intern("JAne Doe", 25, "Java");
        Intern intern3 = new Intern("Intern");
//        Intern intern2 = new Intern("JAne Doe", 25, "DevOps");
        System.out.println(intern1.equals(intern2));
        System.out.println(intern1.hashCode());
        System.out.println(intern2.hashCode());

        //if hash is different ->> obj are different
        //if obj are different =/= hash are equals -> collision
    }
}
