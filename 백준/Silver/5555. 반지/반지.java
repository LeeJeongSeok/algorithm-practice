import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static String str;
	static int N, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			String input = br.readLine();

			StringBuilder sb = new StringBuilder();
			sb.append(input).append(input);

			if (sb.toString().contains(str)) {
				count++;
			}
		}

		System.out.println(count);
	}

}
