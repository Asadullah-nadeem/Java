package lecture;

import static lecture.second.b;

class Room{
    float len;
    float brea;

    void getdata(float a, float b ){
        len = a;
        brea = b;
    }
}

public class rOOMaREA {
    public static void main(String[] args) {
        float area;
        Room rooml = new Room();
        rooml.getdata(14, 10);
        area = rooml.len * rooml.brea;
        System.out.println("Area = " + area);
    }

}