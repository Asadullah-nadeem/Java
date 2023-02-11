package lecture;

public class displaying {
    public static void main(String[] args) {
        System.out.println("Screen Display");
        for (int i = 9; i>=1; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.print("\n");
        }
        System.out.println("Screen Display Done");
    }
}
