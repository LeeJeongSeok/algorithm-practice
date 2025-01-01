import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int A, B, C, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		System.out.println(func());

	}

	private static int func() {
		for (int i = 1; i <= 50 ; i++) {
			for (int j = 1; j <= 50 ; j++) {
				for (int k = 1; k <= 50 ; k++) {
					if ((A * i) + (B * j) + (C * k) == N) {
						return 1;
					}
				}
			}
		}

		return 0;
	}

}