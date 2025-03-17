package 코딩기초트레이님;

public class 특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp,alp.toUpperCase());
        return answer;
    }
}
