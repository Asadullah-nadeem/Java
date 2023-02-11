package lecture;

import java.util.Scanner;

public class votingSysteam {
    public static void main(String[] args) {
        int age;
        System.out.println("Voting Age ");
        Scanner obj=new Scanner(System.in);
        age= obj.nextInt();
        if (age>=18){
            System.out.println("Age is Complete. right to voting ");
        }
        else
        {
            System.out.println("age not complete");
        }
    }
}
