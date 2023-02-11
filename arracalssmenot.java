package lecture;

import java.util.Scanner;

public class arracalssmenot {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.print("Enter Array Elements: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<5; i++)
        {
            a[i] = s.nextInt();

        }for (int b : a){
            System.out.println(b + " ");
        }
    }
}
