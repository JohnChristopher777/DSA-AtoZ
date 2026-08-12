package sorting;

import java.util.*;

public class mergeSort {
    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low ; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }
    

    public void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (int) ((low + high) / 2);

        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);){
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            mergeSort obj = new mergeSort();
            obj.divide(arr, 0, n - 1);
            
            System.out.println(Arrays.toString(arr));
        }
    }
}