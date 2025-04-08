package 프로그래머스코드챌린지예선;

import java.util.HashMap;

public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> memoryScore = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            memoryScore.put(name[i], yearning[i]);
        }

        int[] photoScore = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                photoScore[i] += memoryScore.get(photo[i][j]);
            }
        }

        return photoScore;
    }
}
