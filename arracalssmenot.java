package lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arracalssmenot {
    public static void main(String[] args) {
        int a[][] = new int [2][2];
        System.out.print("Enter Array Elements: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<2; i++)
        {
            for (int j =0; j<2; j++){
                a[i] [j]= s.nextInt();
            }


        }
//        Arrays.sort(a);
        System.out.print("\nMatrix Elements:\n");
        for (int i = 0; i<2; i++)
        {
            for (int j =0; j<2; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();


        }
        //        for (int b : a){
//            System.out.println(b + " ");
//        }
    }
}
