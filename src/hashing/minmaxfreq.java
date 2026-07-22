package hashing;

import java.util.*;

public class minmaxfreq {

    public void brute(int[] arr , int n ) {
        boolean[] visited = new boolean[n];
      
        int minf = n;
        int maxf = 0;
        int mine = 0;
        int maxe = 0;

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

            if (count > maxf) {
                maxf = count;
                maxe = arr[i];
            }
            if (count < minf) {
                minf = count;
                mine = arr[i];
            }
        }
        
        System.out.println(mine + " appeared the most, " + minf + " time/times");
        System.out.println(maxe + " appeared the least, " + maxf + " time/times");
    }

    public void optimize(int[] arr , int n ){

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
              
        int minf = n;
        int maxf = 0;
        int mine = 0;
        int maxe = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int count = entry.getValue();

            if(count > maxf){
                maxf = count;
                maxe = ele;
            }
            if(count < minf){
                minf = count;
                mine = ele;
            }
        }
        System.out.println(mine + " appeared the least, " + minf + " time/times");
        System.out.println(maxe + " appeared the least, " + maxf + " time/times");
    }
        

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            minmaxfreq obj = new minmaxfreq();
            obj.brute(arr, n);
            System.out.println();
            obj.optimize(arr, n);
        }

    }
}
