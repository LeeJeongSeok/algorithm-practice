import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, max;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		max = -1;

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i <= N; i++) {
			int temp = i;
			int count = (int) Arrays.stream(arr).filter(num -> num == temp).count();

			if (temp == count) {
				max = Math.max(max, count);
			}
		}

		System.out.println(max);
	}

}