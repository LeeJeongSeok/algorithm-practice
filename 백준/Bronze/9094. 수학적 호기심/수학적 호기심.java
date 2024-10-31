import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		for (int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int result = 0;

			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if(((a * a) + (b * b) + m) % (a * b) == 0) {
						result++;
					}
				}
			}
			System.out.println(result);
		}

	}

}
