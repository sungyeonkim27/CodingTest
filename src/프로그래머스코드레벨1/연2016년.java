package 프로그래머스코드레벨1;

public class 연2016년 {
    class Solution {
        public String solution(int a, int b) {
            String answer = "";
            int[] calender = {31,29,31,30,31,30,31,31,30,31,30};
            String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int days = 0;

            if (a > 1 ) {
                for (int i = 0; i < a - 1; i++) {
                    days += calender[i];
                }
            }
            days += b - 1;
            answer = week[days % 7];


            return answer;
        }
    }
}
