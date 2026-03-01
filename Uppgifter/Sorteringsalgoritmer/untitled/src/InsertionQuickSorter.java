public class InsertionQuickSorter implements IntSorter{
    private static int M = 20;
    public void sort(int[] arr) {
        ArrayUtil.shuffle(arr);
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr, int lo, int hi){
        if (lo >= hi){
            return;
        }
        if ( hi-lo+1 < M){
            for (int i = lo; i <= hi; i++) {
                for (int j = i; j > lo && arr[j] < arr[j - 1]; j--) {
                    int x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
            return;
        }
        int p = arr[lo];
        int i = lo;
        int j = hi+1;
        while (true){
            while(arr[++i] < p){
                if(i == hi){
                    break;
                }
            }
            while(arr[--j] > p);

            if(i>=j) break;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[lo];
        arr[lo] = arr[j];
        arr[j] = temp;
        sort(arr,lo,j-1);
        sort(arr,j+1,hi);
    }
}
