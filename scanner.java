package lecture;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age > 18 ){
            System.out.print("Adult");
        }else {
            System.out.print("Not Adult");
        }
//        s.next();
        s.close();
    }
}
