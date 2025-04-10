package 프로그래머스코드레벨1;

public class 없는숫자더하기 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int numbersSum = 0;
            for (int i = 0; i < 10; i++) {
                numbersSum += i;
            }
            for (int i = 0; i < numbers.length; i++) {
                answer += numbers[i];
            }
            answer = numbersSum - answer;
            return answer;
        }
    }
}

/*
numbers는 0~9 까지의 숫자 중 일부
answer 에는 없는 숫자를 넣어야함
 */
