import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int X, Y, P1, P2;
	static ArrayList<Integer> xList = new ArrayList<>();
	static ArrayList<Integer> yList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		P1 = Integer.parseInt(st.nextToken());
		P2 = Integer.parseInt(st.nextToken());

		xList.add(P1);
		for (int i = 1; i < 100; i++) {
			xList.add(xList.get(i - 1) + X);
		}

		yList.add(P2);
		for (int i = 1; i < 100; i++) {
			yList.add(yList.get(i - 1) + Y);
		}

		for (int i = Math.max(P1, P2); i <= 10000; i++) {
			if (xList.contains(i) && yList.contains(i)) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(-1);
	}
}