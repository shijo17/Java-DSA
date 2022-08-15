package com.assignment;

import java.util.Scanner;

public class AssignmentQ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0;
        int next = 1;
        int count = 2;
        while (count<=n){
            int temp = next;
            next = previous + next;
            previous = next;
            count++;
        }
        System.out.println(next);
    }
}
