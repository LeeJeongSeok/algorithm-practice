import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] universe;
	static int M, N, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		universe = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				universe[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = i + 1; j < M; j++) {
				if (calculate(universe[i], universe[j])) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

	static boolean calculate(int[] A, int[] B) {

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (!(A[i] < A[j] && B[i] < B[j] || A[i] == A[j] && B[i] == B[j] || A[i] > A[j] && B[i] > B[j])) {
					return false;
				}
			}
		}

		return true;
	}
}