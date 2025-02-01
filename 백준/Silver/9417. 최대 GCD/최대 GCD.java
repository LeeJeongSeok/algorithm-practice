import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		while(N-- > 0) {

			String[] split = br.readLine().split(" ");
			int[] arr = new int[split.length];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(split[i]);
			}

			int max = Integer.MIN_VALUE;

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					max = Math.max(gcd(arr[i], arr[j]), max);
				}
			}

			sb.append(max).append("\n");
		}

		System.out.println(sb.toString());
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

}