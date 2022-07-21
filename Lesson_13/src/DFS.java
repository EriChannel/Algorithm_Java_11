import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int [][] graph = {
                {0,1,0,0,0,0,0},
                {1,0,1,0,0,0,1},
                {0,1,0,1,1,1,1},
                {0,0,1,0,1,1,0},
                {0,0,1,1,0,1,0},
                {0,0,1,1,1,0,0},
                {0,1,1,0,0,0,0}
        };

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();

        //Chọn đỉnh 0 là đỉnh đầu
        stack.add(0);
        set.add(0);

        while (!stack.isEmpty()){
            int u = stack.pop();
            System.out.print(u + "\t");

            for (int i = 0; i < graph.length; i++){
                if(graph[u][i] == 1 && set.contains(i) == false){
                    stack.add(i);
                    set.add(i);
                }
            }
        }
    }
}
