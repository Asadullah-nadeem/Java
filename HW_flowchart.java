import java.util.Scanner;

public class HW_flowchart {
    public static void main(String[] args) {
        int ab;
        System.out.println("Enter Any Amount");
        Scanner obj=new Scanner(System.in);
        ab= obj.nextInt();
    if(ab>=5000 && ab<=10000)
        {
            System.out.println("Invite Your Friend");

        } else if (ab>=5000 && ab<=3400)
        {
            System.out.println("Wait and under standing, and then Invite your Friend");
        } else if (ab>=3400 && ab<=1000) {
            System.out.println("you have not Ina-fa money to Invite Friend");
        }
        else
        {
            System.out.println("you have not Ina-fa money to enjoy your party");
        }
    }
}
