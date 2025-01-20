import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N, count, num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		count = 1;
		num = 666;

		while (count != N) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}

		System.out.println(num);
	}
}