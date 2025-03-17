package 코딩기초트레이님;

public class A강조하기 {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        answer = myString.replace("a","A");

        return answer;
    }
}
