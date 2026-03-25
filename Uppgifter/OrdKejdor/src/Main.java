import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Digraph;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    static String fnam = "fnam.txt";
    static String pair = "pair.txt";

    static boolean checkEdge(String wordOne, String wordTwo) {
        ArrayList<Character> letters = new ArrayList<Character>();

        for (int i = 0; i < wordTwo.length(); i++) {
            letters.add(wordTwo.charAt(i));
        }

        for (int i = 1; i < wordOne.length(); i++) {
            char c = wordOne.charAt(i);

            if (letters.contains(c)) {
                letters.remove((Character) c);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader r =
                new BufferedReader(new InputStreamReader(new FileInputStream(fnam)));
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            String word = r.readLine();
            if (word == null) {
                break;
            }
            assert word.length() == 5;  // indatakoll, om man kör med assertions på
            words.add(word);
        }
        Digraph digraph = new Digraph(words.size());


        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                } else {
                    if (checkEdge(words.get(i), words.get(j))) {
                        digraph.addEdge(i, j);
                    }
                }

            }
        }

        BufferedReader o =
                new BufferedReader(new InputStreamReader(new FileInputStream(pair)));


        while (true) {
            String line = o.readLine();
            if (line == null) {
                break;
            }
            assert line.length() == 11; // indatakoll, om man kör med assertions på
            String start = line.substring(0, 5);
            String goal = line.substring(6, 11);
            // ... sök väg från start till goal här
            int startInt = -1;
            int goalInt = -1;
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).equals(start)) {
                    startInt = i;
                }
            }
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).equals(goal)) {
                    goalInt = i;
                }
            }
            BreadthFirstPaths BFS = new BreadthFirstPaths(digraph, startInt);

            if (!BFS.hasPathTo(goalInt)) {
                System.out.println(-1);
            } else {
                int edges = -1;
                for (int v : BFS.pathTo(goalInt)) {
                    edges++;
                }
                System.out.println(edges);
            }


        }
    }
}
