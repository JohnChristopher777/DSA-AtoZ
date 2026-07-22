package recursion;

import java.util.*;

public class revarray {

    public void swaparray(int[] arr, int i) {
        if (i > arr.length / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

        swaparray(arr , i+1);
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            
            revarray o = new revarray();
            o.swaparray(arr ,0);
        }
    }
}