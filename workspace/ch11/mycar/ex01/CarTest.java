package ch11.mycar.ex01;

public class CarTest {
    static void main() {
        Car mycar = new Car();
        mycar.model = "부가티";

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
    }
}
