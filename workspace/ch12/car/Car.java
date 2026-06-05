package ch12.car;

public class Car {
    private String carName;
    private String carNumber;
    private int maxPassenger;
    private int passengerCount = 1;
    private int speed = 0;
    private int geer = 0;

    public Car(String carName, String carNumber, int maxPassenger) {
        this.carName = carName;
        this.carNumber = carNumber;
        this.maxPassenger = maxPassenger;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGeer() {
        return geer;
    }

    protected void speedUp() {
        if (speed == 0) {
            speed += 10;
            geer = 1;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 10) {
            speed += 10;
            geer = 2;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 20) {
            speed += 10;
            geer = 3;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 40) {
            speed += 10;
            geer = 4;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 60) {
            speed += 10;
            geer = 5;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 80) {
            speed += 10;
            geer = 6;
            System.out.println("속도를 높입니다. 기어를 올립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed > 140) {
            System.out.println("속도가 더이상 올라기지 않습니다.");
        } else {
            speed += 10;
            System.out.println("속도를 높입니다. 현재속도: " + speed + " 기어: " + geer + "단");
        }
    }

    protected void speedDown() {
        if (speed == 40) {
            speed -= 10;
            geer = 3;
            System.out.println("속도를 낮춥니다. 중립으로 놉니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 60) {
            speed -= 10;
            geer = 4;
            System.out.println("속도를 낮춥니다. 기어를 내립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else if (speed == 80) {
            speed -= 10;
            geer = 5;
            System.out.println("속도를 낮춥니다. 기어를 내립니다. 현재속도: " + speed + " 기어: " + geer + "단");
        } else {
            if (speed == 0) {
                geer = 0;
                System.out.println(this.carName + "이/가 정차합니다.");
            } else {
                speed -= 10;
                System.out.println("속도를 낮춥니다. 현재속도: " + speed + " 기어: " + geer + "단");
            }
        }
    }

    protected void start() {
        System.out.println(this.carName + "이/가 출발합니다.");
        speedUp();
    }

    protected void ride() {
        if (passengerCount < maxPassenger) {
            System.out.println("승객이 탑승합니다.");
            passengerCount += 1;
            System.out.println("탑승객: " + passengerCount + "/" + maxPassenger);
        } else {
            System.out.println("정원이 초과되어 탑승할수없습니다.");
            System.out.println("탑승객: " + passengerCount + "/" + maxPassenger);
        }

    }

    protected void leave() {
        System.out.println("승객이 하차합니다.");
        passengerCount -= 1;
        System.out.println("탑승객: " + passengerCount + "/" + maxPassenger);
    }

}
