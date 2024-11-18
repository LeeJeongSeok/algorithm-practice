import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T, n, m;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int count = 0;

			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if (((a * a) + (b * b) + m) % (a * b) == 0) {
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

}