import java.util.ArrayList;

public class CreateGraphAdjList{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
         *              (5)
         *          0---------1
         *                  /   \
         *              (1)/     \(3)
         *                /       \
         *               2---------3
         *            (2)|    (1)
         *               |
         *               4
         */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V]; // null -> empty arrayList

        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }
        //0-vertex
        graph[0].add(new Edge(0,1,5));
        //1-vertex
        graph[1].add(new Edge(1,3,3));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));

        // 2 vertex
        graph[2].add(new Edge(2,  1,  1));
        graph[2].add(new Edge(2, 3,1));
        graph[2].add(new Edge( 2,  4, 2));

        // 3 vertex
        graph[3].add(new Edge( 3,  1,  3));
        graph[3].add(new Edge(3,  2,  1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2 - 1's neighbors
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // src, dest, & weight
            System.out.println(e.dest);
        }

    }
}