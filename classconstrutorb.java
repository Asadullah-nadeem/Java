package lecture;
class X{
    int a;
    String b;
    boolean c;
    X(){
        a = 1200; b = "hero"; c = false;
    }void z(){
        System.out.println(a + " " + b + " " + c);
    }
}

class classconstrutorb {
    public static void main(String[] args) {
        X h = new X();
        h.z();
    }
}
