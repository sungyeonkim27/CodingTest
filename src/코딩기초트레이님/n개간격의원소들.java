package 코딩기초트레이님;

import java.util.ArrayList;
import java.util.List;

public class n개간격의원소들 {
    public List solution(int[] num_list, int n) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }

        return answer;
    }
}
