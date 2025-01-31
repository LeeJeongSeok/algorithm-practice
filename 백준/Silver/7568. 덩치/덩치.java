import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Person {
	int height;
	int weight;

	Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}

public class Main {

	static int N;
	static int[] rank;
	static ArrayList<Person> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		rank = new int[N];

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int height = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list.add(new Person(height, weight));
		}

		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			Person A = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				if (i == j) { continue; }

				Person B = list.get(j);
				if (A.height < B.height && A.weight < B.weight) {
					count++;
				}
			}

			rank[i] = count;
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}