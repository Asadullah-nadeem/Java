package lecture;

public class MultipleAttributesoops {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttributesoops myObj = new MultipleAttributesoops();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}