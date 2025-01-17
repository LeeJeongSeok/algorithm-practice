import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

	static int CHESS_SIZE = 8;
	static int N, M, x, y, min;
	static String[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		min = Integer.MAX_VALUE;

		board = new String[N][M];

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < split.length; j++) {
				board[i][j] = split[j];
			}
		}


		while (x + CHESS_SIZE <= N && y + CHESS_SIZE <= M) {
			// 1. 배열 복사
			String[][] chess = new String[CHESS_SIZE][CHESS_SIZE];

			for (int i = x; i < x + CHESS_SIZE; i++) {
				for (int j = y; j < y + CHESS_SIZE; j++) {
					chess[i - x][j - y] = board[i][j];
				}
			}

			// 2. 맨 왼쪽 위가 흰색으로 시작하는 체스판과 비교
			int white = compareStartWithWhite(chess);

			// 3. 맨 왼쪽 위가 검은색으로 시작하는 체스판과 비교
			int black = compareStartWithBlack(chess);

			min = Math.min(min, Math.min(white, black));

			// 다음 위치로 이동
			y++;
			if (y + CHESS_SIZE > M) { // 한 행의 끝까지 도달하면 다음 행으로 이동
				y = 0;
				x++;
			}
		}


		System.out.println(min);
	}

	private static int compareStartWithWhite(String[][] chess) {
		String[][] whiteChess = new String[CHESS_SIZE][CHESS_SIZE];
		int count = 0;

		// 체스판 패턴 채우기
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// 행과 열의 합이 짝수이면 B, 홀수이면 W
				whiteChess[i][j] = (i + j) % 2 == 0 ? "B" : "W";
			}
		}

		for (int i = 0; i < CHESS_SIZE; i++) {
			for (int j = 0; j < CHESS_SIZE; j++) {
				if (!Objects.equals(whiteChess[i][j], chess[i][j])) {
					count++;
				}
			}
		}

		return count;
	}

	private static int compareStartWithBlack(String[][] chess) {
		String[][] blackChess = new String[CHESS_SIZE][CHESS_SIZE];
		int count = 0;

		// 체스판 패턴 채우기
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// 행과 열의 합이 짝수이면 B, 홀수이면 W
				blackChess[i][j] = (i + j) % 2 == 0 ? "W" : "B";
			}
		}

		for (int i = 0; i < CHESS_SIZE; i++) {
			for (int j = 0; j < CHESS_SIZE; j++) {
				if (!Objects.equals(blackChess[i][j], chess[i][j])) {
					count++;
				}
			}
		}

		return count;
	}
}