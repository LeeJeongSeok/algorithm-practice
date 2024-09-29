import java.io.*;
import java.util.*;

public class Main {

	static int[] arr = new int[10];
	static Set<Integer> hashSet = new HashSet<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			hashSet.add(arr[i] % 42);
		}

		System.out.println(hashSet.size());
	}

}