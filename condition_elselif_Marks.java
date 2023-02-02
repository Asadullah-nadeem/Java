import java.util.Scanner;

public class condition_elselif_Marks {
    public static void main(String[] args) {

       int marks;
        System.out.println("Enter Marks");
        Scanner obj=new Scanner(System.in);
        marks= obj.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("Fast Division (1St)");

        } else if (marks>=45 && marks<=60)
        {
            System.out.println("Second Division (2St)");
        } else if (marks>=33 && marks<=45) {
            System.out.println("Third Division (3St)");

        }
        else
        {
            System.out.println("Fail 0");
        }
    }
}
