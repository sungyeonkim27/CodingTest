package 코딩기초트레이님;

public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if (myString.contains(pat)) {
            answer = 1;

        } else {
            answer = 0;
        }
        return answer;
    }
}
