import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
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
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        //Chọn đỉnh đầu tiên
        queue.add(0);
        set.add(0);

        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + "\t");

            for(int i = 0; i < graph.length; i++){
                if(graph[u][i] == 1 && set.contains(i) == false){
                    queue.add(i);
                    set.add(i);
                }
            }
        }
    }
}
