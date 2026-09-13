package arrays.easy;

import java.util.*;

public class leftrotate { //one-element (optimal approach)
    //It's brute is by using atemp array to store the shifted elements
        public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int n = s.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int temp = arr[0]; //last element for right rotate by one
            for (int i = 1; i < n; i++) { 
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}
