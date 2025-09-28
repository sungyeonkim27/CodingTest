package 해시예제;

import java.util.HashMap;

// 문제 1. 단어 빈도수 세기
//문자열이 주어졌을 때, 각 단어가 몇 번 등장했는지 세어 출력하세요.
// apple banana apple orange banana apple
public class WordCount {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
