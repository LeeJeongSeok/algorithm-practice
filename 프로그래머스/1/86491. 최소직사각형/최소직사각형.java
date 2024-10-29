class Solution {
    public int solution(int[][] sizes) {
		int answer = 0;

		int[][] temp = new int[sizes.length][sizes[0].length];

		for (int i = 0; i < sizes.length; i++) {
			temp[i][0] = Math.max(sizes[i][0], sizes[i][1]);
			temp[i][1] = Math.min(sizes[i][0], sizes[i][1]);
		}

		// w에 최대값과 h의 최대값을 구한다.
		int w = Integer.MIN_VALUE;
		int h = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			w = Math.max(temp[i][0], w);
		}

		for (int i = 0; i < temp.length; i++) {
			h = Math.max(temp[i][1], h);
		}
		return w * h;
	}
}