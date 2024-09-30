import java.io.*;

public class Main {

	static long[] arr;
	static int N;
	static int MAX_VALUE = 1_000_000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new long[N];

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			String result = "YES";

			for (int j = 2; j <= MAX_VALUE; j++) {
				if (num % j == 0) {
					result = "NO";
					break;
				}
			}
			System.out.println(result);
		}
	}

}