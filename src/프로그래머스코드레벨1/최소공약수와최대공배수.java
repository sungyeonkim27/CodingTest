package 프로그래머스코드레벨1;

public class 최소공약수와최대공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / gcd(n,m);

        return answer;
}
    public static int gcd(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



}
