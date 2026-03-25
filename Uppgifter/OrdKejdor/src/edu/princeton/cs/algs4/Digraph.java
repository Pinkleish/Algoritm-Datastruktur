package edu.princeton.cs.algs4;

public class Digraph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();

    }

    public int V() {
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }


    public Digraph reverse() {
        Digraph R = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                R.addEdge(w, v);
            }
        }
        return R;
    }
    public String toString(){
        String s = V + " verticies, " + E + " edges\n";
        for (int v = 0; v < V; v++){
            s += v+1 + ": ";
            for (int w : this.adj(v)){
                s += w+1 + " ";
            }
            s += "\n";
        }
        return s;
    }
}