public class second {


    int a=10;  //instance variable
    static double b=20.5; // static variable

    public static void main(String[] args) {

        boolean c=true; //local variable

        second s=new second();
        System.out.println(s.a+" "+b+" "+c);
        System.out.println(s.a+b+"  next true or false"+c);
    }

}
