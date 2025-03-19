package 코딩기초트레이님;

public class 부분문자열인지확인하기 {
    public int solution(String my_string, String target) {
        int answer = 0;

        if (my_string.contains(target)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
