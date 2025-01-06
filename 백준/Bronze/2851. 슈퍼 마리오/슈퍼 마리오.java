import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int sum;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (num + sum <= 100) {
				sum += num;
			} else if (num + sum > 100) {
				int after = (sum + num) - 100;
				int before = 100 - sum;

				if (after > before) {
					System.out.println(sum);
					return;
				} else if (after < before) {
					System.out.println(sum + num);
					return;
				} else {
					System.out.println(Math.max(sum + num, sum));
					return;
				}
			}
		}

		System.out.println(sum);
	}
}