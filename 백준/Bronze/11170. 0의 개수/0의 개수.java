import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		while(N-- > 0) {

			String[] split = br.readLine().split(" ");
			int start = Integer.parseInt(split[0]);
			int end = Integer.parseInt(split[1]);
			int count = 0;

			for (int i = start; i <= end; i++) {
				String[] s = String.valueOf(i).split("");
				for (int j = 0; j < s.length; j++) {
					if (s[j].equals("0")) {	count++; }
				}
			}

			sb.append(count).append("\n");
		}

		System.out.println(sb.toString());
	}

}