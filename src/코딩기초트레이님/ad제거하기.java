package 코딩기초트레이님;

import java.util.ArrayList;
import java.util.List;

public class ad제거하기 {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }
        answer = list.toArray(String[]::new);
        return answer;
    }
}
