package com.shijo;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

// find the largest of three numbers.


        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);


        // alternative method using math.max
        System.out.println(Math.max(c, Math.max(a,b)));

    }
}
