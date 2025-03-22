package 코딩기초트레이님;

import java.util.ArrayList;
import java.util.List;

public class n번째원소까지 {
    public List solution(int[] num_list, int n) {

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}
