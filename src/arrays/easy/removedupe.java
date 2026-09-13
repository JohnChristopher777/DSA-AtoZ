package arrays.easy;

import java.util.*;

public class removedupe {
    
    public int brute(int[] arr, int n) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int index = 0;
        for (int m : set) {
            arr[index] = m;
            index++;
        }

        return index;
    }
    
    public int optimal(int[] arr, int n) {
        
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        
        return i + 1;
    }


    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            removedupe obj = new removedupe();
            //int count = obj.brute(arr, n);
            int count = obj.optimal(arr, n);

            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}