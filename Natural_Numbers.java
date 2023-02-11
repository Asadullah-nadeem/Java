package lecture;

import java.util.Scanner;

public class Natural_Numbers {
    private static Scanner numb;

    public static void main(String[] args) {
        int num;
        numb = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        num = numb.nextInt();
        for (int i=1; i<=5; i++)
        {
            System.out.println(i +"\t");
        }
        System.out.println("Java Program to Print Natural Numbers ");
    }
}
