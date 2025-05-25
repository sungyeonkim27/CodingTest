package bakjun_estsoft.cookingTime;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        LocalTime now = LocalTime.of(A, B);
        LocalTime afterCook = now.plusMinutes(C);

        int hour = afterCook.getHour();
        int minute = afterCook.getMinute();

        System.out.println(hour);
        System.out.println(minute);
    }
}
