import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] arr;
	static int sum, none1, none2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					none1 = arr[i];
					none2 = arr[j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == none1 || arr[i] == none2) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}

}