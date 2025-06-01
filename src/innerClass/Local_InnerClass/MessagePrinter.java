package innerClass.Local_InnerClass;

// 외부 클래스 정의
public class MessagePrinter {
    private String prefix;

    public MessagePrinter(String prefix) {
        this.prefix = prefix;
    }

    // 메서드 내부에서만 사용할 지역 내부 클래스 정의
    public void printWithSuffix(final String suffix) {
        // ✅ 지역 내부 클래스 선언 (메서드 내부에서만 존재)
        class LocalFormatter {
            public void formatAndPrint(String message) {
                // 외부 클래스의 필드(prefix)와 메서드 매개변수(suffix)에 접근 가능
                System.out.println(prefix + " " + message + " " + suffix);
            }
        }

        // 지역 클래스 인스턴스 생성 및 사용
        LocalFormatter formatter = new LocalFormatter();
        formatter.formatAndPrint("Hello, World!");
    }
}

