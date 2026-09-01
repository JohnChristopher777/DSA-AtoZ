package arrays.easy;

import java.util.*;

public class large_sndlarge {
    public void optimal(int[] arr, int n) {
        int max = arr[0];
        int sndmax = -1;
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > sndmax && arr[i] != max) {
                sndmax = arr[i];    
            }
        }

        System.out.println("The Largest element of the array is " + max);
        System.out.println("The 2nd Largest element of the array is " + sndmax);
    }

    public void better(int[] arr, int n) {
        int max = arr[0];
        int sndmax = -1;
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > sndmax) {
                sndmax = arr[i];
            }
        }

        System.out.println("The Largest element of the array is " + max);
        System.out.println("The 2nd Largest element of the array is " + sndmax);
    }

    public void small(int[] arr, int n) {
        
        int least = arr[0];
        int sndleast = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] < least) {
                least = arr[i];
            }
            if (arr[i] != least && arr[i] < sndleast) {
                sndleast = arr[i];
            }
        }
         System.out.println("The smallest element of the array is " + least);
        System.out.println("The 2nd Smallest element of the array is " + sndleast);
    }
    
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int n = s.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            large_sndlarge obj = new large_sndlarge();
            obj.better(arr, n);
            obj.optimal(arr, n);
            obj.small(arr, n);
        }
    }
}