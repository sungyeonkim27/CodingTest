package 코딩기초트레이님;

public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replacedString = myString.replace("A", "X").replace("B","A")
                .replace("X","B");
        if (replacedString.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
