public class Uppg1c {

    public static int countpairs(int[] sortedarr) {

        int pairs = 0;

        if (sortedarr.length == 0) {
            return 0;
        }

        int lika = 1;

        for (int i = 1; i < sortedarr.length; i++) {

            if (sortedarr[i] == sortedarr[i - 1]) {
                lika++;
            } else {
                pairs += (lika * (lika - 1)) / 2;
                lika = 1;
            }
        }


        pairs += (lika * (lika - 1)) / 2;

        return pairs;
    }
}