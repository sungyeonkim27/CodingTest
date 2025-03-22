package 코딩기초트레이님;

public class 가까운1찾기 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return answer;
    }
}
