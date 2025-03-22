package 코딩기초트레이님;

import java.util.ArrayList;
import java.util.List;

public class n번째원소부터 {
    public List solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}
