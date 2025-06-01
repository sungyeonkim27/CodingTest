package innerClass.Non_Static_InnerClass;

// 외부 클래스 Car 정의
public class Car {
    private String model;

    // 외부 클래스 생성자
    public Car(String model) {
        this.model = model;
    }

    // ✅ 일반 내부 클래스 Engine 정의
    class Engine {
        // 내부 클래스 메서드: 외부 클래스의 필드에 접근
        void start() {
            System.out.println(model + " engine started.");
        }
    }

    // 외부 클래스 메서드에서 내부 클래스 사용
    public void startCar() {
        Engine engine = new Engine();
        engine.start();
    }
}

