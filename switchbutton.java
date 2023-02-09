package lecture;

import java.util.Scanner;

public class switchbutton {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int button = s.nextInt();
        switch (button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Hello1");
                break;
            case 3 :
                System.out.println("Hello2");
                break;
            case 4 :
                System.out.println("Hello3");
                break;
            case 5 :
                System.out.println("Hello5");
                break;

            case 6 :
                System.out.println("Hello6");
                break;

            default:
                System.out.println("Error " + button + " this Button not Available");
        }
    }
}
