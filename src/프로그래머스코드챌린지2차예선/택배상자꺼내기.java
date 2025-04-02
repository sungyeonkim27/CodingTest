package 프로그래머스코드챌린지2차예선;

public class 택배상자꺼내기 {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int rest = 0;
        rest = n % w;
        answer = n / w - num / w + 1;
        if ((num / w) % 2 == 1) {
            if (num % w > rest) {
                if ((n / w) % 2 == 1) {
                    answer--;
                } else {
                    answer++;
                }
            }
        } else if((num / w) % 2 == 0){
            if ((w - (num % w)) >= rest) {
                if ((n / w) % 2 == 1) {
                    answer--;
                } else {
                    answer++;
                }
            }

        }

        return answer;

    }

}
