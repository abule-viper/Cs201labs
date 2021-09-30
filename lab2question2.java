package Lesson1;

import java.util.Scanner;

public class lab2question2 {
    public static void main(String[] args) {
       /* Write a program that accepts a string input and outputs the number of characters in the string
        and the first and last character in separate lines. For 80 Chapter 2 Getting Started with Java
        example, if the input is, I like Java then the output would be
        11
        I
        a*/
         Scanner input = new Scanner(System.in);
         String x;
         x=input.nextLine();
        System.out.println(x.length());
        System.out.println("the first letter is :" + x.charAt(0) + "\nthe last letter is :" + x.charAt(x.length()- 1));
    }
}
