import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 1; i < N; i++) {
			int sum = 0;
			int temp = i;

			while (temp > 0) {
				sum += temp % 10;
				temp = temp / 10;
			}

			if (sum + i == N) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);
	}

}