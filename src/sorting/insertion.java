package sorting;

import java.util.*;

public class insertion {
    public void insert(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];  //not swap but shofting of elements 
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public void recins(int[] arr, int n) {
        if (n <= 1)
            return;
        
        recins(arr, n - 1);
        
        int key = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
       arr[j + 1] = key;
   
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

            //obj.recins(arr, n);
            System.out.println(Arrays.toString(arr));
        }
    }
}