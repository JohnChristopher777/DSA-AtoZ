package sorting;

import java.util.*;

public class insertion {
    public void insert(int[] arr, int n) {
        
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j > 0 && arr[j] > key) {
                arr[i] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);){
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            insertion obj = new insertion();
            obj.insert(arr, n);
        }
    }
}