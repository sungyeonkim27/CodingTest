package multilingual;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        LocalTime time = LocalTime.of(H, M);
        LocalTime preTime = time.minusMinutes(45);

        int hour = preTime.getHour();
        int minute = preTime.getMinute();

        System.out.println(hour);
        System.out.println(minute);
    }
}
