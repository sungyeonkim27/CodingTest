package bakjun_private.수학1.진법변환;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int tenNumber = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int point = 0;
            if (ch >= '0' && ch <= '9') {
                point = (int) ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                point = (int) ch - 'A' + 10;
            }
            tenNumber += point * (int) Math.pow(B, (N.length() - 1 - i));
        }
        System.out.println(tenNumber);
    }

    /*
    1. N의 각 자리수를 하나씩 변수ch에 저장
    2. ch를 int로 변경. 알파벳인 경우와 숫자인 경우를 고려.
    2. 각 자리수에 해당하는 문자를 10진법으로 변환
    3. B진법의 길이가 X인 Y번째 숫자 ch의 10진법 변환식
       ch * (X - 1 - Y) ^ B
    4. 각 자리수를 모두 10진법으로 변환하여 더하면 N의 10진법 변환 완료
     */
}
