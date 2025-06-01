package innerClass.Non_Static_InnerClass;

// 실행용 Main 클래스
public class Main {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        Car car = new Car("Tesla");

        // ✅ 내부 클래스 인스턴스를 직접 생성
        Car.Engine engine1 = car.new Engine();
        engine1.start();  // 출력: Tesla engine started.

        // ✅ 외부 클래스 메서드를 통해 내부 클래스 사용
        car.startCar();   // 출력: Tesla engine started.
    }
}

