import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(7);
        stack.add(1);
        stack.add(8);

        stack.forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        System.out.println("Phần tử đầu tiên: " +stack.firstElement());
        System.out.println(stack.pop());

    }
}
