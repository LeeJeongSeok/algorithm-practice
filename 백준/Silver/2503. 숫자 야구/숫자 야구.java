import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class BaseBall {
	int number;
	int strike;
	int ball;

	public BaseBall(int number, int strike, int ball) {
		this.number = number;
		this.strike = strike;
		this.ball = ball;
	}
}

public class Main {

	static int N, answer;
	static ArrayList<BaseBall> baseBalls = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());

			baseBalls.add(new BaseBall(number, strike, ball));
		}

		for (int i = 123; i < 999; i++) {
			int count = 0;

			int a1 = i / 100;
			int b1 = (i % 100) / 10;
			int c1 = i % 10;

			if (a1 == 0 || b1 == 0 || c1 == 0 || a1 == b1 || a1 == c1 || b1 == c1) continue;

			for (int j = 0; j < baseBalls.size(); j++) {
				BaseBall current = baseBalls.get(j);
				int strikeCount = 0;
				int ballCount = 0;

				int a2 = current.number / 100;
				int b2 = (current.number % 100) / 10;
				int c2 = current.number % 10;

				if (a1 == a2) strikeCount++;
				if (b1 == b2) strikeCount++;
				if (c1 == c2) strikeCount++;

				if (a1 == b2 || a1 == c2) ballCount++;
				if (b1 == a2 || b1 == c2) ballCount++;
				if (c1 == a2 || c1 == b2) ballCount++;

				if (strikeCount == current.strike && ballCount == current.ball) {
					count++;
				}
			}

			if (count == N) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}