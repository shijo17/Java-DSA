package com.shijo;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("the character is Lowercase");
        } else {
            System.out.println("The character is UpperCase");
        }


        System.out.println(ch);
        //      String word = "Shijo";
//        System.out.println(word.charAt(0));
    }
}
