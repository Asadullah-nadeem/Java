package lecture;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(85);
        tree_set.add(22);
        tree_set.add(54);
        tree_set.add(55);
        tree_set.add(135);
        tree_set.add(845);
        tree_set.add(8578);
        tree_set.add(1185);
        tree_set.add(8585);
        tree_set.add(3585);
        tree_set.add(84585);
        tree_set.add(5385);
        tree_set.add(857565);
        tree_set.add(454332);
        tree_set.add(10452);
        tree_set.add(12054);
        tree_set.add(885241);
        tree_set.add(8455);
        tree_set.add(789);
        tree_set.add(11);
        System.out.println(tree_set);
        Comparator com = tree_set.comparator();
        System.out.println(com);
        OtherClass obj = new OtherClass();
        obj.someMethod();
    }

}

class OtherClass {
    public void someMethod() {
        StringBuilder sb = new StringBuilder("StringBuilder Append boolean value:- ");

        // Appending the boolean value
        sb.append(36.47);
        System.out.println("Output: " + sb);
    }
}