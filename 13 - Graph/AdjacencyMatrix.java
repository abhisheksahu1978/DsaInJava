public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0}
        };

        for(int i = 0; i < graph.length; i++) {
        for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
        }
            System.out.println();
        }
    }
}