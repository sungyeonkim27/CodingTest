package 코딩기초트레이님;

public class 첫번째로나오는음수 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return answer;
    }
}
