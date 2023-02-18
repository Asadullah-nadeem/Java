package lecture;

public class person {
    private final String name;
    private final int age;

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
