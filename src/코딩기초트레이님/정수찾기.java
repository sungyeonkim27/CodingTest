package 코딩기초트레이님;

public class 정수찾기 {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return answer = 1;
            }
        }
        return answer;
    }
}
