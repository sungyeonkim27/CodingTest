package 프로그래머스코드레벨1;
import java.util.Scanner;
public class 직사각형별찍기 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    /*
    a가 가로길이
    b가 세로길이
     */
