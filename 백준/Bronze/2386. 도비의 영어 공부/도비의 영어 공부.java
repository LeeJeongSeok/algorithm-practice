import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("#")) {
				break;
			}

			String[] split = line.toLowerCase().replaceAll(" ", "").split("");
			String alphabet = split[0];
			int count = 0;

			for (int i = 1; i < split.length; i++) {
				if (alphabet.equals(split[i])) {
					count++;
				}
			}

			System.out.println(alphabet + " " + count);
		}
	}

}