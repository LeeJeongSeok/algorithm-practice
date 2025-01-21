import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
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
			int A = 0, C = 0, G = 0, T = 0;
			int max = Integer.MIN_VALUE;
			ArrayList<String> list = new ArrayList<>();

			for (int j = 0; j < N; j++) {
				String alphabet = dna[j][i];

				if (alphabet.equals("A")) {
					A++;
					max = Math.max(max, A);
				} else if (alphabet.equals("C")) {
					C++;
					max = Math.max(max, C);
				} else if (alphabet.equals("G")) {
					G++;
					max = Math.max(max, G);
				} else {
					T++;
					max = Math.max(max, T);
				}
			}

			if (max == A) {
				list.add("A");
			}

			if (max == C) {
				list.add("C");
			}

			if (max == G) {
				list.add("G");
			}

			if (max == T) {
				list.add("T");
			}


			if (list.size() >= 2) {
				Collections.sort(list);
				sb.append(list.get(0));
			} else {
				sb.append(list.get(0));
			}
		}

		int sum = 0;

		for (int i = 0; i < N; i++) {
			int count = 0;
			String S = sb.toString();
			for (int j = 0; j < M; j++) {
				if (!Objects.equals(dna[i][j], String.valueOf(S.charAt(j)))) {
					count++;
				}
			}

			sum += count;
		}

		System.out.println(sb.toString());
		System.out.println(sum);
	}
}
