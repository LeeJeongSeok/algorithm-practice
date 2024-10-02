import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int N, K, answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= 59; j++) {
				for (int k = 0; k <= 59; k++) {
					if (i % 10 == K || i / 10 == K || j % 10 == K || j / 10 == K || k % 10 == K || k / 10 == K) {
						answer++;
					}
				}
			}
		}

		System.out.println(answer);
	}

}