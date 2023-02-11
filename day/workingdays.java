package lecture.day;

public class workingdays {
    public static void main(String[] args) {
        for (Days d: Days.values()){
            weekend(d);
        }
    }
    private static void weekend(Days d){
        if (d.equals(Days.Sunday))
            System.out.println("Value = " + d +" is a Holiday");
            System.out.println("Value = " + d + " is a Working day");

    }
}
