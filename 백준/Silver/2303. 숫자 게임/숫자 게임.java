import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N, answer;
	static int[] player;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		player = new int[N];
		arr = new int[N][5];

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(split[j]);
			}
		}

		for (int i = 0; i < N; i++) {
			player[i] = calculate(arr[i]);
		}


		findWinner(player);

		System.out.println(answer);
	}

	private static int calculate(int[] arr) {
		int max = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					max = Math.max(max, sum % 10);
				}
			}
		}

		return max;
	}

	private static void findWinner(int[] player) {
		int max = 0;

		for (int i = 0; i < player.length; i++) {
			if (player[i] >= max) {
				max = player[i];
				answer = i + 1;
			}
		}
	}
}