package 프로그래머스코드레벨1;

public class 택배상자꺼내기 {
    public int solution(int n, int w, int num) {
        int answer = 0;

        int[] width_num = new int[w];

        for (int i = 0; i < w; i++) {
            width_num[i] = n / w;
        }

        if (n / w % 2 == 0) {
            for (int i = 0; i < n % w; i++) {
                width_num[i] += 1;
            }
        } else if (n / w % 2 == 1) {
            for (int i = w - 1; i > w - 1 - n % w; i--) {
                width_num[i] += 1;
            }
        }

        if (num % w == 0 && num / w % 2 == 0) {
            answer = width_num[0] - num / w + 1;

        } else if (num % w == 0 && num / w % 2 == 1) {
            answer = width_num[w - 1] - num / w + 1;

        } else if (num % w != 0 && num / w % 2 == 0) {
            answer = width_num[num % w - 1] - num / w;

        } else if (num % w != 0 && num / w % 2 == 1) {
            answer = width_num[w - num % w] - num / w;
        }

        return answer;
    }
}