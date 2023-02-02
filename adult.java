import java.util.Scanner;

public class adult {
    public static void main(String[] args) {
            int Adult;
            System.out.println("Adult and Not Adult ");
            Scanner obj=new Scanner(System.in);
            Adult= obj.nextInt();
            if (Adult>=18){
                System.out.println("Yes you are adult");
            }
            else
            {
                System.out.println("Yes your age is  not-complete adult");
            }
        }
    }
