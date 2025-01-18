import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static String str;
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();

		for (int i = 1; i < str.length(); i++) {
			String temp1 = str.substring(0, i);
			for (int j = i + 1; j < str.length(); j++) {
				String temp2 = str.substring(i, j);
				String temp3 = str.substring(j);
				list.add(new StringBuilder(temp1).reverse().append(new StringBuilder(temp2).reverse()).append(new StringBuilder(temp3).reverse()).toString());
			}
		}

		Collections.sort(list);
		System.out.println(list.get(0));
	}
}