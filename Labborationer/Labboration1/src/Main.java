import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static String encryptText(String in, int key) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + key + 26) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + key + 26) % 26);
            }
            out.append(c);
        }
        return out.toString();
    }


    public static void main(String[] args)throws Exception {
        byte[] a = Files.readAllBytes(Paths.get("bible-en.txt"));
        String s = new String(a, 0, 12, "US-ASCII");
       // String s = "Testar. Ett6t66t, två, tre";
        int key = -24;
        long before = System.currentTimeMillis();
        String t = encryptText(s, key);
        long after = System.currentTimeMillis();
        System.out.println("Efter: " + t);
        double millis = (after-before)/1000.0;
        System.out.println(millis);
        System.out.println(s);

    }

}