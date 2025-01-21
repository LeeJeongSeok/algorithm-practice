import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M, sum;
	static String[][] dna;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		dna = new String[N][M];

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < split.length; j++) {
				dna[i][j] = split[j];
			}
		}

		for (int i = 0; i < M; i++) {
			int[] count = new int[4];

			for (int j = 0; j < N; j++) {
				String alphabet = dna[j][i];

				if (alphabet.equals("A")) { count[0]++; }
				else if (alphabet.equals("C")) { count[1]++; }
				else if (alphabet.equals("G")) { count[2]++; }
				else { count[3]++; }
			}

			int max = 0;
			int idx = 0;

			for (int j = 0; j < 4; j++) {
				if (count[j] > max) {
					max = count[j];
					idx = j;
				}
			}

			if (idx == 0) { sb.append("A"); }
			else if (idx == 1) { sb.append("C"); }
			else if (idx == 2) { sb.append("G"); }
			else { sb.append("T"); }

			sum += N - max;
		}


		System.out.println(sb.toString());
		System.out.println(sum);
	}
}