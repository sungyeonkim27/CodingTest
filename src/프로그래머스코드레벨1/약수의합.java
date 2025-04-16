package 프로그래머스코드레벨1;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer += i;
                if (i * i != n) {
                    answer += n / i;
                }
            }
        }
        return answer;
    }
}
