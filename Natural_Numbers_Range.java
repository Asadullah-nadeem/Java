package lecture;

import java.util.Scanner;

public class Natural_Numbers_Range {
    private static Scanner NMR;
    public static void main(String[] args)
    {
        int minimum, maximum;
        NMR = new Scanner(System.in);

        System.out.print(" Please Enter the Minimum value : ");
        minimum = NMR.nextInt();

        System.out.print(" Please Enter the Maximum value : ");
        maximum = NMR.nextInt();

        NaturalNumbers(minimum, maximum);
    }
    public static void NaturalNumbers(int min, int max)
    {


        for(int i = min; i <= max; i++)
        {
            System.out.print(i +" ");
        }
    }
}