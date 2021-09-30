package Lesson1;
import java.util.Scanner;
public class lab2question3 {
    public static void main(String[]args){
        System.out.println("enter a word ");
        Scanner keyboard= new Scanner(System.in);
        String x;
        x=keyboard.nextLine();
        char y=x.charAt((x.length()/2));
        System.out.println(y);
    }

}
