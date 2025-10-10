package bakjun_private.집합과맵.회사에있는사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : list) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}

/*
list를 Collections 함수를 이용하여 역순으로 만들어서 제출하는 문제다.
1. list를 Collections 함수를 이용하여 역순으로 만들기
2. 초기 정보는 HashSet에 담고 나중에 list로 변환하여 역순으로 정렬을 한다.

TroubleShooting
1. Collections.remove를 사용할 때 ArrayList보다 HashSet이 시간복잡도가 적기 때문에 반드시 정렬 전까지는 HashSet을 사용해야 한다.
 */