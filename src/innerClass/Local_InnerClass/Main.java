package innerClass.Local_InnerClass;

// 메인 클래스 정의
public class Main {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter("[INFO]");
        printer.printWithSuffix("(END)");  // 출력: [INFO] Hello, World! (END)
    }
}

