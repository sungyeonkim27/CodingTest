import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 예시: 한 줄 입력받기
        String line = br.readLine();           // 문자열 한 줄 입력
        int n = Integer.parseInt(line);        // 정수로 변환

        // 출력 예시: 반복 출력
        for (int i = 1; i <= n; i++) {
            bw.write(i + "\n");                // 줄바꿈은 수동으로 "\n"
        }

        bw.flush();     // 💡 버퍼 비우기 — 맨 마지막에 한 번만
        bw.close();     // 스트림 닫기
        br.close();     // 입력 스트림도 닫기
    }
}
