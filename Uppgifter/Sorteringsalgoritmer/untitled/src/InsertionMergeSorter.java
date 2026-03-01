public class InsertionMergeSorter implements IntSorter {
    private static int M = 20;
    public void sort(int[] arr){
        if (arr == null || arr.length <=1) return;
        int[] extra = new int[arr.length];
        sort(arr,extra,0,arr.length -1);
    }

    public static void sort(int[] arr,int[] extra, int lo, int hi){
        if (lo >= hi) return;
        int mid = (hi+lo)/2;
        if (hi-lo +1 < M){
            for (int i = lo; i <= hi; i++) {
                for (int j = i; j > lo && arr[j] < arr[j-1]; j--) {
                    int x = arr[j]; arr[j] = arr[j-1]; arr[j-1] = x;
                }
            }
            return;

        }
        sort(arr,extra,lo,mid);
        sort(arr,extra,mid+1,hi);
        merge(arr,extra,lo,mid,hi);


    }

    public static void merge(int[] arr ,int[] extra,int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            extra[i] = arr[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = extra[j++];
            else if (j > hi) arr[k] = extra[i++];
            else if (extra[i] < extra[j]) arr[k] = extra[i++];
            else arr[k] = extra[j++];
        }
    }
}
