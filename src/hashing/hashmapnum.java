package hashing;

import java.util.*;

public class hashmapnum {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("The size of the array: ");
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int freq = 0;
                int key = arr[i];
                if (map.containsKey(key))
                    freq = map.get(key);
                freq++;
                map.put(key, freq);
            }

            System.out.println("The no. queries: ");
            int q = s.nextInt();
            for (int i = 0; i < q; i++) {
                int num = s.nextInt();
                if (map.containsKey(num))
                    System.out.println(num + " appears "+ map.get(num) + " times from the given array.");
                else
                    System.out.println(num + " appears 0 times from the given array.");
            }
        }
    }
}
