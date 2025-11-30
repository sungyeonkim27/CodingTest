package bakjun_private.심화2.영단어암기는괴로워;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 단어 -> 빈도수
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            // 길이 M 미만이면 스킵
            if (word.length() < M) continue;

            // 빈도수 증가
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // 정렬을 위해 keySet을 리스트로 변환
        List<String> words = new ArrayList<>(freq.keySet());

        // 정렬 기준:
        // 1. 빈도수 내림차순
        // 2. 길이 내림차순
        // 3. 알파벳 사전순 오름차순
        Collections.sort(words, (o1, o2) -> {
            int c1 = Integer.compare(freq.get(o2), freq.get(o1)); // 빈도수 내림차순
            if (c1 != 0) return c1;

            int c2 = Integer.compare(o2.length(), o1.length());   // 길이 내림차순
            if (c2 != 0) return c2;

            return o1.compareTo(o2);                              // 사전순 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append('\n');
        }

        System.out.print(sb);
    }
}
