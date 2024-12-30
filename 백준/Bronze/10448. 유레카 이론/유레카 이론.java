import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int T, K;
	static int[] candidate;
	static int[] arr;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			K = Integer.parseInt(br.readLine());
			arr = new int[K];
			candidate = new int[3];

			for (int i = 0; i < K; i++) {
				arr[i] = i + 1;
			}

			if (bfs(0)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	private static boolean bfs(int depth) {
		if (depth == 3) {
			int sum = 0;
			for (int i = 0; i < candidate.length; i++) {
				int temp = candidate[i] * (candidate[i] + 1) / 2;
				sum += temp;
			}

			return sum == K;
		} else {
			for (int i = 0; i < arr.length; i++) {
				candidate[depth] = arr[i];
				if (bfs(depth + 1)) { // 조건을 만족하면 즉시 반환
					return true;
				}
				candidate[depth] = 0;
			}
		}

		return false;
	}

}