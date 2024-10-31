import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] first = new int[]{1, 2, 3, 4, 5};
		int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % first.length]) answer[0]++;
			if (answers[i] == second[i % second.length]) answer[1]++;
			if (answers[i] == third[i % third.length]) answer[2]++;
		}

		// 최대값을 뽑아야겠지
		int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

		// 만약 최대값이 여러개인 경우 이름을 오름차순 정렬
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == max) {
				list.add(i + 1); // answer의 배열에서는 0부터 시작하기 때문에 1로 맞춰주기 위해서 더해야함
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}