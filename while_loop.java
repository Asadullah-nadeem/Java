package lecture;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int num;
        System.out.println("ENter any Number: ");
        Scanner obj=new Scanner(System.in);
        num = obj.nextInt();
        while (num>=0)
        {
            if (num%2==0)
            {
                System.out.println("Even Number");
                break;

            }
            else
            {
                System.out.println("Odd Number");
                break;
            }
        }
    }
}
