package 프로그래머스코드레벨1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i = 0;
        while (i < section.length) {
            int end = section[i] + m - 1;
            answer++;
            i++;
            while (i < section.length && section[i] <= end) {
                i++;
            }

        }

        return answer;
    }
}
