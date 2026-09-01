package arrays.easy;

import java.util.*;

public class sorted {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);){
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            boolean sort = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] >= arr[i-1]) {

                } else {
                    sort = false;
                    break;
                }
            }
            
            System.out.println(sort);
        }
    }
}
