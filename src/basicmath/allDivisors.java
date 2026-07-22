package basicmath;

import java.util.*;

public class allDivisors {

	public List<Integer> optimize(int N) {

		List<Integer> list = new ArrayList<>();
		//O(sqrt(N))
		for (int i = 1; i * i <= N; i++) { //instead of calling i <= (int)Math.sqrt(N) function each time 
			if (N % i == 0) {
				list.add(i);
				if (N / i != i) {
					list.add(N / i);
				}
			}

		}
		//O(K*log(K))
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
	    try (Scanner s = new Scanner(System.in)) {
			int N = s.nextInt();
			//for brute force it's O(N)
			for (int i = 1; i <= N; i++) {
				if (N % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();

			//optimized
			allDivisors obj =new allDivisors();
			List<Integer> result = obj.optimize(N);
			//O(K)
			for (int n : result) {
				System.out.print(n + " ");
			}
	    }
	}
	//on the whole for optimized O(sqrt(N)log(N)) -> O(sqrt(N))
}
