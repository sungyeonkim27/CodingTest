package 프로그래머스코드레벨1;

public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 0; i < number; i++) {
            int attack = countDivisors(i + 1);
            if (attack > limit) {
                answer += power;
            } else {
                answer += attack;
            }
        }
        return answer;
    }

    private int countDivisors(int num) {
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count += 2;
                if (i * i == num) {
                    count--;
                }
            }
        }
        return count;
    }
}
