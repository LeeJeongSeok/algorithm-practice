import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String line = br.readLine();
			String[] strArr = line.split(" ");

			if (Integer.parseInt(strArr[0]) == -1) {
				break;
			}

			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < strArr.length - 1; i++) {
				list.add(Integer.parseInt(strArr[i]));
			}

			// 배수 찾기
			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				int temp = list.get(i) * 2;

				if (list.contains(temp)) {
					count++;
				}
			}

			sb.append(count).append("\n");
		}

		System.out.print(sb);
	}
}