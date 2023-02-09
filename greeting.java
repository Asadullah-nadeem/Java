package lecture;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Button = s.nextInt();
        System.out.println("Press Button : " + Button);
        if (Button == 1){
            System.out.println("Hello");
        }else if (Button == 2){
            System.out.println("Namaste");
        }else{
            System.out.println("Bonjour");
        }


    }
}
