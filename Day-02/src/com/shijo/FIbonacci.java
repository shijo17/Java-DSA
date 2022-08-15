package com.shijo;

import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n){

            // the value of temp stores the previous value of i.
            // i + p the result is displayed and temp then is moved to p.
           int temp = i;
           i = i + p;
           p = temp;
           count++;
        }
        System.out.println(i);


    }
}
