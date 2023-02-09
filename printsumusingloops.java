package lecture;

import java.util.Scanner;

public class printsumusingloops
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nm = s.nextInt();

        int sum = 0;
        for (int i =0; i<=nm; i++){
            sum = sum + 1;
        }
        System.out.println(sum);
    }
}