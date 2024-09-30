import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, answer;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i <= N; i++) { // 택희
			for (int j = 0; j <= N; j++) { // 영훈이
				for (int k = 0; k <= N; k++) { // 남규
					if (i + j + k == N) {
						if (k >= j + 2) {
							if (i != 0 && j != 0 && k != 0) {
								if (i % 2 == 0) {
									answer++;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(answer);
	}

}