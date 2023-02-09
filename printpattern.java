package lecture;

public class printpattern {
    public static void main(String[] args) {
//        for (int i =0; i<=4; i++){
//            System.out.println("*");
//        }
        int a = 4;
        int b = 5;

        for (int i = 1; i<=a; i++){
            for (int j =1; j<=b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
