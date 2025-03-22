package 코딩기초트레이님;

import java.util.ArrayList;
import java.util.List;

public class 다섯명씩 {
    public String[] solution(String[] names) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                list.add(names[i]);
            }
        }
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}
