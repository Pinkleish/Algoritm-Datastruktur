public class Main{
    public static void main (String[] args){
        int N = 10;
        int[] arrayA = new int[N];
        int[] arrayB = new int[N];
        int[] arrayC = new int[2*N];


        // Allokerar A
        for (int i=0;i<N;i++){
            arrayA[i] = (i+3)/2;
            System.out.print(arrayA[i] + " ");
        }

        // Allokerar B
        System.out.println("");
        for (int i=0;i<N;i++){
            int j=2*i+i-i/2;
            arrayB[i] = j;
            System.out.print(arrayB[i] + " ");
        }

        // Allokerar C
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < N && j < N){
            if (arrayA[i] <= arrayB[j]){
                arrayC[k] = arrayA[i];
                i+=1;
            }
            else{
                arrayC[k] = arrayB[j];
                j+=1;
            }
            k+=1;
        }

        while (i<N){
            arrayC[k] = arrayA[i];
            i+=1;
            k+=1;
        }

        while (j<N){
            arrayC[k] = arrayB[j];
            j+=1;
            k+=1;
        }

        // Printar C
        System.out.println("");
        for (int o = 0; o< arrayC.length; o++){
            System.out.print(arrayC[o] + " ");
        }








    }
}
