import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N, min, a, b, count;
	static int[][][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][5][7];
		min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String line = br.readLine();
				for (int k = 0; k < 7; k++) {
					arr[i][j][k] = line.charAt(k) - '0';
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				count = 0;

				for (int k = 0; k < 5; k++) {
					for (int l = 0; l < 7; l++) {
						if (arr[i][k][l] != arr[j][k][l]) {
							count++;
						}
					}
				}

				if (count < min) {
					min = count;
					a = i + 1;
					b = j + 1;
				}
			}
		}

		System.out.println(a + " " + b);
	}
}
