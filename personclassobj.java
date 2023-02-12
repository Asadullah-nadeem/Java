package lecture;

import static java.lang.System.out;

public class personclassobj {
    int age = 21;
    int weight = 6;
    String color = "Light";

    void eat(){
        out.print("Eating\n");
    }
    void sleep(){
        out.print("Sleeping\n");
    }
    void run(){
        out.print("Runing\n");
    }

    public static void main(String[] args) {
        personclassobj x = new personclassobj();
        out.println(x.age);
        out.println(x.weight);
        out.println(x.color);
        x.eat();
        x.sleep();
        x.run();
    }
}
