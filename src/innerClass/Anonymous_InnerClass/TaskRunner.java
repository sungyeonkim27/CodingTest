package innerClass.Anonymous_InnerClass;

import java.util.Timer;
import java.util.TimerTask;

// 외부 클래스 TaskRunner 정의
public class TaskRunner {

    public void runTask() {
        // ✅ 익명 내부 클래스로 TimerTask 구현
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed!");
            }
        };

        // ✅ Timer를 사용해 1초(1000ms) 뒤에 task 실행
        Timer timer = new Timer();
        timer.schedule(task, 1000);
    }
}

