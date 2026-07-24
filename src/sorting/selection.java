package sorting;

import java.util.Scanner;

public class selection {
    public void select(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for ( int num : arr) {
            System.out.print(num + " ");
        }
    } 


    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            selection obj = new selection();
            obj.select(arr, n);
        }
    }
}