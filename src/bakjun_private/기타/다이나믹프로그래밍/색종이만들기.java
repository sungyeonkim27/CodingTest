package bakjun_private.기타.다이나믹프로그래밍;

import java.util.*;
import java.io.*;

public class 색종이만들기 {

    static int [][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void divide(int x, int y, int size){
        if(isSameColor(x, y, size)){
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newsize = size / 2;
        divide(x, y, newsize); // 4사분면
        divide(x+newsize, y, newsize); // 1사분면
        divide(x, y+newsize, newsize); // 3사분면
        divide(x+newsize, y+newsize, newsize); // 2사분면
    }

    public static boolean isSameColor(int x, int y, int size){

        int color = paper[x][y];
        for (int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if (color != paper[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}