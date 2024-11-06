import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int caseCount = Integer.parseInt(br.readLine());
		int[] bool = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int max = -1;

		for (int i = 0; i <= caseCount; i++) {
			int temp = i;
			int cnt = (int) Arrays.stream(bool).filter(num -> num == temp).count();

			if (temp == cnt) {
				max = Math.max(max, cnt);
			}
		}

		System.out.println(max);
	}

}