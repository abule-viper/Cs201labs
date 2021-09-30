package Lesson1;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String fName,mName,lName;
        System.out.println("enter your first name");
        fName=keyboard.nextLine();
        System.out.println("enter your middle name");
        mName= keyboard.nextLine();
        System.out.println("enter your last name");
        lName=keyboard.nextLine();
       fName=fName.substring(0,1).toUpperCase() + fName.substring(1);
        lName=lName.substring(0,1).toUpperCase() + lName.substring(1);
        System.out.println(fName +" "+ mName.substring(0,1).toUpperCase() + "."+lName);
    }
}
