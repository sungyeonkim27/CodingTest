package 프로그래머스코드챌린지예선;
/*
1. 두사람 사이의 선물 기록을 보고 다음달 받을 선물을 계산
2. 만약, 주고받은 수가 같으면 선물지수가 큰사람이 작은사람에게 받음. 같으면 그냥 무시.
3. 선물지수는 (준 선물) - (받은 선물)


 */

public class 가장많이받은선물 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] exchange = new int[friends.length][friends.length];
        int[] giftIndex = new int[friends.length];
        int[] nextMonthGift = new int[friends.length];

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                String s = friends[i] + " " + friends[j];
                for (int k = 0; k < gifts.length; k++) {
                    if (s.equals(gifts[k])) {
                        exchange[i][j] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < friends.length; i++) {
            int giveGift = 0;
            int receiveGift = 0;
            for (int j = 0; j < friends.length; j++) {
                giveGift += exchange[i][j];
            }
            for (int k = 0; k < friends.length; k++) {
                receiveGift += exchange[k][i];
            }
            giftIndex[i] = giveGift - receiveGift;
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (i == j) {
                    continue;
                } else if (exchange[i][j] > exchange[j][i]) {
                    nextMonthGift[i] ++;
                } else if (exchange[i][j] == exchange[j][i]) {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGift[i] ++;
                    }
                }
            }
        }

        for (int i = 0; i < nextMonthGift.length; i++) {
            if (answer < nextMonthGift[i]) {
                answer = nextMonthGift[i];
            }
        }

        return answer;
    }

}
