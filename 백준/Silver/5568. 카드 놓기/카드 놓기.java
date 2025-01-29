import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	static int N, K;
	static int[] arr, temp;
	static HashSet<String> set = new HashSet<>();
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		arr = new int[N];
		temp = new int[K];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dfs(0);
		visited[0] = true;

		System.out.println(set.size());
	}

	private static void dfs(int depth) {
		if (depth == K) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < temp.length; i++) {
				sb.append(temp[i]);
			}
			set.add(sb.toString());
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					temp[depth] = arr[i];
					dfs(depth + 1);
					temp[depth] = 0;
					visited[i] = false;
				}
			}
		}
	}

}