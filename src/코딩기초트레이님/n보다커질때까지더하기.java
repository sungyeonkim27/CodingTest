package 코딩기초트레이님;

public class n보다커질때까지더하기 {
    public int solution(int[] number, int n) {
        int answer = 0;
        for (int i : number) {
            answer += i;
            if (answer > n) {
                return answer;
            }
        }
        return answer;
    }
}
