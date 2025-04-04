package 프로그래머스코드챌린지2차예선;

public class 택배상자꺼내기 {
    public int solution(int n, int w, int num) {
        int answer = 0;

        //N = MAX_NUM, W = 넓이, NUM = CHOICE NUM
        int []width_num = new int[w]; // w = 3;
        for(int i = 0; i<w;i++)
        {
            width_num[i] = n / w; // i = 0,1,2에 n/w = 4를 저장함
            System.out.println(width_num[i]);
        }

        if(n / w % 2 !=0) // 층수가 짝수일 경우 오른쪽 시작
        {
            for(int i = w - 1; i > w - 1 - n % w;i--)
            {
                width_num[i]+=1; // i = 2에 +1
            }
        }

        else if(n / w % 2 == 0) // 층수가 홀수일 경우 왼쪽에서 시작
        {
            for(int i=0;i<n%w;i++)
            {
                width_num[i]+=1; // i = 0 에 +1
                System.out.println(width_num[i]);
            }
        }
        System.out.println(width_num[0]);

        if(num % w == 0 && num / w % 2 == 0){ // w의 배수이고 w로 나눈값이 2의배수일때,

            answer = width_num[0] - num / w + 1;

        }
        else if(num % w == 0 && num / w % 2 != 0){

            answer = width_num[w-1]-num/w+1;
        }

        if(num / w % 2 == 0 && num % w != 0){

            answer = width_num[num%w-1]-num/w;
        }
        else if(num / w % 2 != 0 && num % w != 0){
            answer = width_num[w - num % w] - num / w;
        }
        return answer;
    }

}
