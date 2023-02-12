package lecture;
class A{
    int a;
    String name;
    A(){
        a=0;
        name=null;
    }void show(){
        System.out.println(a + " "+ name);
    }
}
public class javaconstructor {
    public static void main(String[] args) {
        A x = new A();
        x.show();
    }
}
