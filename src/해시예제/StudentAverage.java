package 해시예제;

import java.util.HashMap;
import java.util.Map;

/*
문제 3. 성적 평균 계산
학생 이름과 점수 배열이 주어졌을 때, 각 학생의 평균 점수를 출력하세요.
 */
public class StudentAverage {
    public static void main(String[] args) {
        Map<String, int[]> scores = new HashMap<>();

        scores.put("Alice", new int[]{90, 80, 70});
        scores.put("Bob", new int[]{30, 80, 70});
        scores.put("Charlie", new int[]{20, 45, 70});

        for (Map.Entry<String, int[]> entry : scores.entrySet()) {
            String name = entry.getKey();
            int[] arr = entry.getValue();

            int sum = 0;
            for (int score : arr) {
                sum += score;
            }

            double avg = (double) sum / arr.length;
            System.out.println(name + " : " + avg);
        }
    }
}
