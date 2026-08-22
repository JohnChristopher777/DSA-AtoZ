package sorting;

import java.util.*;

public class quick {
    public int part(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        
        for (int j = low; j <= high - 1; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i+1;
    }

    public void qs(int[] a, int low, int high) {
        
        if (low < high){ //base-case  
        int pivotIndex = part(a, low , high);
        qs(a, low, pivotIndex - 1);
        qs(a, pivotIndex + 1, high); 
        }
        
    }


    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            int n = s.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            quick obj = new quick();
            obj.qs(a, 0, n-1);

            System.out.println(Arrays.toString(a));
        }        
    }
}