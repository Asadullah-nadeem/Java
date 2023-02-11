package lecture;

public class Comlinetest {
    public static void main(String[] args) {
        int count, i= 0;

        String st;
        count = args.length;
        System.out.println("Number Of argument = " + count);
        while (i <count){
            st = args[i];
            i = i +1;
            System.out.println(i + " : " +  "java is " + st + "!");
        }
    }
}
