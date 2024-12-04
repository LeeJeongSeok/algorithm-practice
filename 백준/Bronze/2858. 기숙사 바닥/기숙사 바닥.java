import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int R, B;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		for (int w = 1; w < R; w++) {
			for (int l = 1; l < R; l++) {
				if ((l - 2) * (w - 2) == B && l * 2 + (w - 2) * 2 == R) {
					System.out.println(l + " " + w);
					return;
				}
			}
		}
	}

}