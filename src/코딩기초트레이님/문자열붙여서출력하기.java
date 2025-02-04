package 코딩기초트레이님;
import java.util.Scanner;
public class 문자열붙여서출력하기 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            a.trim();
            String b = sc.next();
            System.out.println(a + b);
        }
    }
}
