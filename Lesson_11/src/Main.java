import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(90);
        hashSet.add(2);
        hashSet.add(6);
        hashSet.add(10);
        hashSet.add(null);
        System.out.println(hashSet.add(1));

        hashSet.forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(9);
        linkedHashSet.add(1);
        linkedHashSet.add(3);

        linkedHashSet.forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(2);
       // treeSet.add(null);
        treeSet.forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        System.out.println(treeSet.descendingSet());
    }
}