import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] arr, temp;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[9];
		temp = new int[7];
		visited = new boolean[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dfs(0);
	}

	private static void dfs(int depth) {
		if (depth == 7) {
			if (calculate()) {
				Arrays.stream(temp).sorted().forEach(System.out::println);
				System.exit(0);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					temp[depth]	= arr[i];
					dfs(depth + 1);
					visited[i] = false;
				}
			}
		}
	}

	private static boolean calculate() {
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		return sum == 100;
	}

}