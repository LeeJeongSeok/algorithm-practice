import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M, result;
	static boolean[][] pairs;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		pairs = new boolean[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			pairs[a][b] = true;
			pairs[b][a] = true;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				if (pairs[i][j]) { continue; }
				for (int k = j + 1; k <= N; k++) {
					if (!pairs[j][k] && !pairs[k][i]) {
						result++;
					}
				}
			}
		}

		System.out.println(result);

	}

}