package hashing;

import java.util.*;

public class freqhash {

    public void brute(int[] arr , int n ) {
        boolean[] visited = new boolean[n];
      
    
        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : appeared " + count + " time/times");
        }

    }

    public void optimize(int[] arr , int n ){

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : appeared " + entry.getValue() + " time/times");
        }
    }
        

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            freqhash obj = new freqhash();
            obj.brute(arr, n);
            System.out.println();
            obj.optimize(arr, n);
        }

    }
}
