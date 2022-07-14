import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.add(5);
        deque.add(2);
        deque.add(9);
        deque.add(8);
        deque.add(1);

        deque.forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        deque.addFirst(0);
        deque.addLast(10);

        deque.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        deque.removeFirst();
        deque.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        deque.removeLast();
        deque.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }
}
