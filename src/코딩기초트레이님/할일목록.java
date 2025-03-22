package 코딩기초트레이님;

import java.util.*;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}

/*
boolean 배열에서 거짓에 해당하는 인덱스를 임의의 배열에 저장하고, 그 인덱스로 하지못한 일들을 불러낸다.
 */