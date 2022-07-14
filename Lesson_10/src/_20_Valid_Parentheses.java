import java.util.Arrays;
import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        isValid("(]");
        System.out.println(Arrays.toString(args));
    }
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println("Ký tự " +c);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
                System.out.println("stack.push: " + stack);
            } else if ((c == ')' && !stack.isEmpty() && stack.peek() == '(') ||
                    (c == '}' && !stack.isEmpty() && stack.peek() == '{') ||
                    (c == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                stack.pop();
                System.out.println("stack.pop: " + stack);
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
