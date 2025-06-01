package innerClass.Static_InnerClass;

// 외부 클래스 Computer 정의
public class Computer {
    private static String manufacturer = "Dell"; // 정적 필드
    private String model; // 인스턴스 필드

    public Computer(String model) {
        this.model = model;
    }

    // ✅ 정적 내부 클래스 Specs 정의
    static class Specs {
        // 외부 클래스의 정적 필드에는 접근 가능
        void printManufacturer() {
            System.out.println("Manufacturer: " + manufacturer);
        }

        // ❌ 외부 클래스의 인스턴스 필드에는 접근 불가
        void printModel() {
            // System.out.println("Model: " + model); // 컴파일 오류
        }
    }

    // 외부 클래스 메서드에서 정적 내부 클래스 사용
    public void showSpecs() {
        Specs specs = new Specs();
        specs.printManufacturer();
    }
}
