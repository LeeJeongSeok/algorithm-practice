import java.io.*;

public class Main {

	static long[] arr;
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new long[N];

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			boolean isTrue = true;

			for (int j = 2; j <= 1_000_000; j++) {
				if (num % j == 0) {
					System.out.println("NO");
					isTrue = false;
					break;
				}
			}
			if (isTrue) {
				System.out.println("YES");
			}
		}
	}

}