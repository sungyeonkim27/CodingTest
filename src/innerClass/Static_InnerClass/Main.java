package innerClass.Static_InnerClass;

// 실행용 Main 클래스
public class Main {
    public static void main(String[] args) {
        // 1. 외부 인스턴스 없이 정적 내부 클래스 사용 가능
        Computer.Specs specs1 = new Computer.Specs();
        specs1.printManufacturer();  // 출력: Manufacturer: Dell

        // 2. 외부 클래스 인스턴스를 통해 내부 클래스 메서드 간접 호출
        Computer computer = new Computer("XPS 15");
        computer.showSpecs(); // 출력: Manufacturer: Dell
    }
}
