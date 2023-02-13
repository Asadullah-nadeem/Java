package lecture.RealLife;

import java.util.Scanner;

import static java.lang.System.out;

public class add {
    public static void main(String[] args) {
//        int x = 2;
//        int y = 2;
//        int sum = x + y + 1;
//        System.out.println("2 + 2 = " + sum );
        Scanner m = new Scanner(System.in);
        out.print("Enter First Number: ");
        int x = m.nextInt();
        out.print("Enter Second Number: ");
        int y = m.nextInt();
        int n = x + y ;

        out.println("The sum is: " + n + +x);

        if (n > 5 + 1){
            out.println("2 + 2 = 5");

        }else {
            out.println("Error");
        }

    }
}
