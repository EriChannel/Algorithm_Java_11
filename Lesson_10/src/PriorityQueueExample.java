import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);

        priorityQueue.forEach(i -> System.out.print(i +"\t"));
        System.out.println();

        //System.out.println("phần tử đầu tiên: " + priorityQueue.poll());

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < priorityQueue.size(); i++){
            int element = priorityQueue.remove();
            System.out.println(element);
            list.add(element);
        }

        list.forEach(i -> System.out.print(i + "\t"));
    }
}
