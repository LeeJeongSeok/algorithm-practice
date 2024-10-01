import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class BallCount {

	int number;
	int strike;
	int ball;

	public BallCount(int number, int strike, int ball) {
		this.number = number;
		this.strike = strike;
		this.ball = ball;
	}
}

public class Main {

	static ArrayList<BallCount> list = new ArrayList<>();
	static int N, count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int number = Integer.parseInt(st.nextToken());
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());

			list.add(new BallCount(number, strike, ball));
		}

		for (int i = 123; i < 988; i++) {
			int a2 = i / 100;
			int b2 = i / 10 - (a2 * 10);
			int c2 = i % 10;

			if (a2 == 0 || b2 == 0 || c2 == 0 || a2 == b2 || a2 == c2 || b2 == c2) {
				continue;
			}

			if (find(a2, b2, c2)) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static boolean find(int a2, int b2, int c2) {

		for (int i = 0; i < list.size(); i++) {
			BallCount curBallCount = list.get(i);

			int a1 = curBallCount.number / 100;
			int b1 = curBallCount.number / 10 - (a1 * 10);
			int c1 = curBallCount.number % 10;

			int st1 = curBallCount.strike;
			int ba1 = curBallCount.ball;


			int st2 = 0;
			int ba2 = 0;

			if (a1 == a2) st2++;
			if (b1 == b2) st2++;
			if (c1 == c2) st2++;

			if (a2 == b1 || a2 == c1) ba2++;
			if (b2 == a1 || b2 == c1) ba2++;
			if (c2 == a1 || c2 == b1) ba2++;

			if (st1 != st2 || ba1 != ba2) {
				return false;
			}
		}


		return true;
	}

}