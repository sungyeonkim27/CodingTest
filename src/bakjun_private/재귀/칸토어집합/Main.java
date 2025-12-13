package bakjun_private.재귀.칸토어집합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();

            int size = (int) Math.pow(3, N);
            boolean[] cantor = new boolean[size];
            boolean[] result = new boolean[size];

            for (int i = 0; i < size; i++) {
                cantor[i] = true;
            }

            result = cantor(cantor);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                if (result[i]) {
                    sb.append("-");
                } else {
                    sb.append(" ");
                }
            }

            System.out.println(sb);
        }

    }

    public static boolean[] cantor(boolean[] arr) {
        boolean[] a = new boolean[arr.length / 3];
        boolean[] b = new boolean[arr.length / 3];
        boolean[] c = new boolean[arr.length / 3];

        if (isCantor(arr)) {
            return arr;
        } else {
            System.arraycopy(arr, 0, a, 0, arr.length / 3);
            for (int i = 0; i < arr.length / 3; i++) {
                b[i] = false;
            }
            System.arraycopy(arr, arr.length * 2 / 3, c, 0, arr.length / 3);
            boolean[] aC = cantor(a);
            boolean[] bC = cantor(b);
            boolean[] cC = cantor(c);
            arr = merge(aC, bC, cC);
        }
        return arr;
    }

    public static boolean[] merge(boolean[] a, boolean[] b, boolean[] c) {
        int A = a.length;
        int B = b.length;
        int C = c.length;
        boolean[] result = new boolean[A + B + C];
        System.arraycopy(a, 0, result, 0, A);
        System.arraycopy(b, 0, result, A, B);
        System.arraycopy(c, 0, result, A + B, C);

        return result;
    }

    public static boolean isCantor(boolean[] arr) {
        boolean pre = arr[0];
        boolean now = false;
        if (arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            now = arr[i];
            if (now && pre) {
                return false;
            }
            pre = arr[i];
        }
        return true;
    }
}
