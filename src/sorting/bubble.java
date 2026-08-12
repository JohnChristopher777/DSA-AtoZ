package sorting;

import java.util.*;

public class bubble{
    public void maxadj(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;        //optimized to get O(N)
            for (int j = 0; j <= i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
                
            }
            if (didSwap == 0) {
                break;
            }
            System.out.println("Swap happened");
        }
            System.out.print(Arrays.toString(arr));
    } 


    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            bubble obj = new bubble();
            obj.maxadj(arr, n);
        }
    }
}