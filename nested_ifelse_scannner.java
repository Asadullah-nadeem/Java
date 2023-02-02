import java.util.Scanner;

 class nested_ifelse_scannner {
    public static void main(String[] hello) {
        int num1,num2;

        System.out.println("maximum number");
        Scanner obj=new Scanner(System.in);
        num1= obj.nextInt();
        num2= obj.nextInt();
        if (num1>num2)
        {
            if (num1>num2)
            {
                System.out.println("maximum Number:= " + num1);
            }
            else
            {
                System.out.println("maximum number:= " +num2);

            }
        }
        else
        {
            if (num2>num1)
            {
                System.out.println("maximum Number: " +num2);
            }
            else
            {
                System.out.println("maximum Number: "+num1);
            }
        }
    }
}
