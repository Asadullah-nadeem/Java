package lecture;

import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {
        int  pwd;
        System.out.print("Enter Password");
        Scanner obj=new Scanner(System.in);
        pwd= obj.nextInt();
        if (pwd==123){
            System.out.println("ID = 2452635456456n1m5nm1544hjk654k");
            System.out.println("Name = Asadullah Nadeem");
            System.out.println("Age = 18");
            System.out.println("Location:= Z zone east way");
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
