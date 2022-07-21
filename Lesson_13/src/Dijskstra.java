public class Dijskstra {
    public static void main(String[] args) {
        int [][] graph = {
                {0,6,0,1,0},
                {6,0,5,2,2},
                {0,5,0,0,5},
                {1,2,0,0,1},
                {0,2,5,1,0}
        };

        int start = 0;
        int finish = 2;
        dijskstra(graph, start, finish);
    }

    public static void dijskstra(int[][] graph, int start, int finish){
        int n = graph.length;
        boolean [] visited = new boolean[n];
        int [] distance = new int[n];

        distance[start] = 0;
        for(int i = 1; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n-1; i++){
            //Tìm đỉnh có khoảng cách nhỏ nhất
            int minVertex = findMinVertex(distance, visited);
            System.out.println("ĐỈnh có khoảng cách nhỏ nhất: " + minVertex);
            visited[minVertex] = true; //ĐỈnh đã được thăm

            //Tìm đỉnh kể với đỉnh vừa tìm
            for(int j = 0; j < n; j++){
                if(graph[minVertex][j] != 0
                        && !visited[j]
                        && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex] + graph[minVertex][j];
                    System.out.println("khoảng cách mới: " + newDistance);
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }


        }
        System.out.println(start + " -> " + finish + " = " + distance[finish]);
        for(int i = 0; i < n; i++){
            System.out.println(i + " - " + distance[i]);
        }
    }

    public static int findMinVertex(int []distance, boolean[] visited){
        int minVertex = -1;
        for(int i = 0; i < distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }
}
