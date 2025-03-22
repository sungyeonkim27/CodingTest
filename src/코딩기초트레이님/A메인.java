package 코딩기초트레이님;

public class A메인 {
    public static void main(String[] args) {
        int[] arr = {};
            int[] answer = {1, 2, 3, 100, 99, 98};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    answer[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    answer[i] = arr[i] * 2;
                }
            }


    }
}
