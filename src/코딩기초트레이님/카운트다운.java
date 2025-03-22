package 코딩기초트레이님;

public class 카운트다운 {
    public int[] solution(int start_num, int end_num) {
        int[] answer =new int[start_num - end_num + 1];

        for (int i = 0; i < start_num - end_num + 1; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}
