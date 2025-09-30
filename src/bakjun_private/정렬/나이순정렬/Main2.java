package bakjun_private.정렬.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];

            members.add(new Member(age, name));
        }

        // 나이 기준으로만 정렬 (stable sort라 입력 순서 유지됨)
        members.sort(Comparator.comparingInt(m -> m.age));

        StringBuilder sb = new StringBuilder();
        for (Member m : members) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        System.out.println(sb);
    }
}

class Member{
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
