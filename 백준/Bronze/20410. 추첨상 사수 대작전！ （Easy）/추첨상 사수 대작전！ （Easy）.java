import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int m, seed, x1, x2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		seed = Integer.parseInt(st.nextToken());
		x1 = Integer.parseInt(st.nextToken());
		x2 = Integer.parseInt(st.nextToken());

		for (int a = 1; a < m; a++) {
			for (int c = 1; c < m; c++) {
				if (((a * seed + c) % m) == x1 && ((a * x1 + c) % m) == x2) {
					System.out.println(a + " " + c);
					return;
				}
			}
		}
	}

}