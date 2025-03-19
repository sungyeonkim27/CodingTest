package 코딩기초트레이님;
import java.util.*;

public class 배열의원소삭제하기 {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }

        for(int del : delete_list){
            int index = answer.indexOf(del);

            if (index != -1) {
                answer.remove(index);
            }
        }

        return answer;
        //못품
    }
}
