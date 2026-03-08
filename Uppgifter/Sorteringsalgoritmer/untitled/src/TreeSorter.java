import java.util.Map;
import java.util.TreeMap;
public class TreeSorter implements IntSorter {


    public void sort(int[] arr) {
        TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
        for (int x : arr) {
            if (tree.containsKey(x)) {
                tree.put(x, tree.get(x) + 1);
            } else {
                tree.put(x, 1);
            }
        }

        int i = 0;
        for (Map.Entry<Integer, Integer> subtree : tree.entrySet()) {
            int nyckel = subtree.getKey();
            int antal = subtree.getValue();
            for (int j = 0; j < antal; j++) {
                arr[i++] = nyckel;

            }
        }
    }
}

