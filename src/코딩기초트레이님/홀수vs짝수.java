package 코딩기초트레이님;

public class 홀수vs짝수 {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < num_list.length; i += 2) {
            oddsum += num_list[i];
        }
        for (int i = 1; i < num_list.length; i += 2) {
            evensum += num_list[i];
        }
        if (oddsum >= evensum) {
            answer = oddsum;
        } else {
            answer = evensum;
        }
        return answer;
    }
}
