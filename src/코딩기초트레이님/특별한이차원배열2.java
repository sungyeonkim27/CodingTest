package 코딩기초트레이님;

public class 특별한이차원배열2 {
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                } else {
                    answer = 0;
                    return answer;
                }
            }
        }
        return answer;
    }
}

