package lecture;

    import java.util.Scanner;

    class SamrtCard{
        int emp_idn;
        public void Markattendeance(Employee e){

            emp_idn = e.getEmpid(); // ok
            System.out.println("Employee " + emp_idn + "Is Marked Present");
        }
        public int getEmpIdn(Employee e){ //ok
            return e.empid;
        }
    }
    class Employee{
        int empid;
        Employee(){
            System.out.println("Enter Employee id ");
            Scanner sc = new Scanner(System.in);
            this.empid = sc.nextInt(); // ok
        }
        int getEmpid(){
            return empid;
        }
        public  void Login(SamrtCard sc){
            // instruction to Login Functionality....
    //        get empid of the samrt card holder
            int eid = sc.getEmpIdn(this);
            System.out.println("Login Succesful for Employee " + eid);
        }

    }
    public class Association {
        public static void main(String[] args) {
            System.out.println("Association between employee and smartcard");
            Employee e = new Employee();
            System.out.println("New Employee is Created");
            SamrtCard scd = new SamrtCard();
            scd.Markattendeance(e);
            /*passing the reference of emp to smartcard*/
            e.Login(scd);
        }
    }
