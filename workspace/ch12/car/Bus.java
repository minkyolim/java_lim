package ch12.car;

public class Bus extends Car {
    private String[] stations = {
            "상대원1동행정복지센터", "다솜유치원", "중원초교", "상대원3동행정복지센터",
            "중원경찰서", "대원중.금광중", "신구대학", "금광1,2동행정복지센터",
            "단대오거리역", "신흥역.종합시장"
    };
    private int stationsArrayNumber;

    public Bus(String carName, String carNumber, int maxPassenger) {
        super(carName, carNumber, maxPassenger);
    }

}
