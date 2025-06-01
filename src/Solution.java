
public class Solution {
    public int solution(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = LCM(result,arr[i]);
        }
        return result;
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            return GCD(b, a % b);
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
