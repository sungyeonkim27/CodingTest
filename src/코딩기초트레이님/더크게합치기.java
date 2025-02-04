package 코딩기초트레이님;

public class 더크게합치기 {
        class Solution {
            public int solution(int a, int b) {
                int answer = 0;
                String A = String.valueOf(a);
                String B = String.valueOf(b);
                String numSt1 = A + B;
                String numSt2 = B + A;
                int num1 = Integer.valueOf(numSt1);
                int num2 = Integer.valueOf(numSt2);
                System.out.println(num1);
                System.out.println(num2);
                if (num1 > num2) {
                    answer = num1;
                } else {
                    answer = num2;
                }
                return answer;
            }
        }


}
