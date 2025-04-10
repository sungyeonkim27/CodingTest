package 프로그래머스코드레벨1;

import java.util.HashMap;

public class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        for (String call : callings) {
            int curIndex = rankMap.get(call);
            String prevPlayer = players[curIndex - 1];

            players[curIndex - 1] = call;
            players[curIndex] = prevPlayer;

            rankMap.put(call, curIndex - 1);
            rankMap.put(prevPlayer, curIndex);
        }


        return players;
    }
}
