import java.io.*;

public class Main {

	static int A, T, N, bc, dc, count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(br.readLine());
		T = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		count = 2;

		while (true) {
			for (int i = 0; i < 4; i++) {
				if (i % 2 == 0) {
					bc++;
				} else {
					dc++;
				}

				if (bc == T && N == 0) {
					System.out.println((bc + dc - 1) % A);
					return;
				}

				if (dc == T && N == 1) {
					System.out.println((bc + dc - 1) % A);
					return;
				}
			}

			for (int i = 0; i < count; i++) {
				bc++;
				if (bc == T && N == 0) {
					System.out.println((bc + dc - 1) % A);
					return;
				}
			}

			for (int i = 0; i < count; i++) {
				dc++;
				if (dc == T && N == 1) {
					System.out.println((bc + dc - 1) % A);
					return;
				}
			}
			count++;
		}

	}

}