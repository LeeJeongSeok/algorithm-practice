import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N, adrianCount, brunoCount, goranCount, max;
	static String[] answer;
	static String[] adrian = new String[]{"A", "B", "C"};
	static String[] bruno = new String[]{"B", "A", "B", "C"};
	static String[] goran = new String[]{"C", "C", "A", "A", "B", "B"};
	static StringBuilder sb = new StringBuilder();


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		answer = br.readLine().split("");

		// 각각 맞춘 문제 카운트
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].equals(adrian[i % adrian.length])) {
				adrianCount++;
			}

			if (answer[i].equals(bruno[i % bruno.length])) {
				brunoCount++;
			}

			if (answer[i].equals(goran[i % goran.length])) {
				goranCount++;
			}
		}

		max = Math.max(Math.max(adrianCount, brunoCount), goranCount);

		sb.append(max).append("\n");

		if (max == adrianCount) {
			sb.append("Adrian").append("\n");
		}

		if (max == brunoCount) {
			sb.append("Bruno").append("\n");
		}

		if (max == goranCount) {
			sb.append("Goran").append("\n");
		}

		System.out.println(sb.toString());
	}

}