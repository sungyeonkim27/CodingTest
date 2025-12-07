package bakjun_private.재귀.재귀의귀재;

import java.util.Scanner;

public class Main{
    public static int recursion(String s, int l, int r, int count){
        if(l >= r){
            System.out.println(1 + " " + count);
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            System.out.println(0 + " " + count);
            return 0;
        } else {
            count++;
            return recursion(s, l + 1, r - 1, count);
        }
    }
    public static int isPalindrome(String s){
        int count = 1;
        return recursion(s, 0, s.length()-1, count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            isPalindrome(word);
        }
    }
}
