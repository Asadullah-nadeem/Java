import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter Any two number");
        Scanner s=new Scanner(System.in);

        a=s.nextInt();
        b= s.nextInt();

        c=a+b;
        System.out.println("Sum of two number "+c);


    }
}
