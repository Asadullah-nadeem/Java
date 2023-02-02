import java.util.Scanner;

public class scannerTRY {

    static int n;
    static int g;
    static int h;
    static int j;
    static int k;
    static int l;
    public static void main(String[] args) {
        System.out.println("Click=  ");
        Scanner sup=new Scanner(System.in);
        n = sup.nextInt();
        g = sup.nextInt();
        h = sup.nextInt();
        j = sup.nextInt();
        k = sup.nextInt();
        l = sup.nextInt();

        int c = n + g * h / j + k * l;
        System.out.println(" " + c);
    }
}
