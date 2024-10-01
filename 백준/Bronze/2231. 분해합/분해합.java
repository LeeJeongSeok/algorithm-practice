import java.io.*;

public class Main {

	static int N, result;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int sum = 0;
			int number = i;

			while (number != 0) {
				sum += number % 10;
				number = number / 10;
			}

			if (sum + i == N) {
				result = i;
				break;
			}
		}

		System.out.println(result);
	}

}