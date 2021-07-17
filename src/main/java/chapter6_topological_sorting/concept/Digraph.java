package chapter6_topological_sorting.concept;

public class Digraph {

    private final int V; //顶点的数目
    private int E; //边的数目
    private Bag<Integer>[] adj; //每个顶点指向的边
    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v=0;v<V;v++) {
            adj[v] = new Bag<Integer>();
        }
    }
    public int V() {return this.V;}
    public int E() {return this.E;}
    public void addEdge(int v, int w) {
        adj[v].add(w);
        this.E++;
    }
    public Iterable<Integer> adj(int v) {
        return this.adj[v];
    }
    public static void main(String[] args) {
        Digraph graph = new Digraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
    }
}
