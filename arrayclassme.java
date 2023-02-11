package lecture;

public class arrayclassme {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};

//        System.out.println(a[2]/*+a[]*/);
        for (int b : a){
            System.out.println(b+ " " +
                    "10 \n" +
                    "20 \n" +
                    "30 \n" +
                    "40 \n" +
                    "50 ");
        }
    }
}
