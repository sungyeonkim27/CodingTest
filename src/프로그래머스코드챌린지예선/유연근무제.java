package 프로그래머스코드챌린지예선;
/*
1. timelogs[i][0] ~timelogs[i][6] 까지 모두 만족한 schedules[i]에게만 지급
2. timelogs[i][j], schdules[i]를 서로 비교하여 만족해야함
3. startday = 6,7인 경우인 timelogsdml j는 조건에 포함하면 안됨.
 */

public class 유연근무제 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int fail = 0;
        for (int i = 0; i < schedules.length; i++) {
            for (int j = 0; j < 7; j++) {
                if ((startday + j) % 7 == 6 || (startday + j) % 7 == 0) {
                    continue;
                } else if (timeToMinutes(schedules[i]) + 10 < timeToMinutes(timelogs[i][j])) {
                    fail += 1;
                    break;
                }

            }
        }
        answer = schedules.length - fail;
        return answer;
    }

    private int timeToMinutes(int time) {
        return (time / 100) * 60 + (time % 100);
    }

}
