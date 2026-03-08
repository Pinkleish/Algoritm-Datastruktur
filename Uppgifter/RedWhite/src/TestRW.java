import edu.princeton.cs.algs4.Graph;

public class TestRW {
    public static void main(String[] args) {
        Graph G = new Graph(13);
        G.addEdge(0, 1);
        G.addEdge(3, 2);
        G.addEdge(3, 5);
        G.addEdge(4, 3);
        G.addEdge(4, 2);
        G.addEdge(6, 9);
        G.addEdge(8, 7);
        G.addEdge(8, 9);
        G.addEdge(9, 11);
        G.addEdge(10, 12);
        G.addEdge(11, 12);
        G.addEdge(12, 9);

        System.out.println(RedWhite.count(G, new int[] { 3 }));                                        // should print 3
        System.out.println(RedWhite.count(G, new int[] { 3, 4, 2 }));                                  // should print 1
        System.out.println(RedWhite.count(G, new int[] { 3, 4, 2, 11, 12 }));                          // should print 4
        System.out.println(RedWhite.count(G, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 })); // should print 0
        System.out.println(RedWhite.count(G, new int[] {  }));                                         // should print 0
    }
}