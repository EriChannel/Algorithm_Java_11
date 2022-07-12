import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.offer(7);

        linkedList.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Lấy ra phần tử đầu tiên: " +linkedList.peek());
        System.out.println("Phần tử đầu tiên: " + linkedList.poll());

        linkedList.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Phần tử đầu tiên: " + linkedList.element());


    }
}
