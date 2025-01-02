import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr = new int[5];
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					min = Math.min(min, lcm(lcm(arr[i], arr[j]), arr[k]));
				}
			}
		}

		System.out.println(min);
	}

	// 최대공약수(GCD)를 구하는 함수 (유클리드 호제법)
	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// 최소공배수(LCM)를 구하는 함수
	private static int lcm(int a, int b) {
		return a / gcd(a, b) * b; // GCD를 활용한 LCM 계산
	}
}