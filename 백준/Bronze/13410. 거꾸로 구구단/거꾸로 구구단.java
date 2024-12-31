import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	static int N, K, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		max = Integer.MIN_VALUE;

		for (int i = 0; i < K; i++) {
			List<String> list = Arrays.stream(String.valueOf(N * (i + 1)).split("")).collect(Collectors.toList());
			Collections.reverse(list);

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j));
			}

			max = Math.max(max, Integer.parseInt(sb.toString()));
		}

		System.out.println(max);
	}

}