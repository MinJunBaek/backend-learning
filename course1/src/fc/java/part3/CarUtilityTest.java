package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하세요.
        int carSn = 1110;
        String carName = "BMW828i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G"; // 'G' -> char

        // 데이터를 하나로 묶는다(이동하기 위해서)
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarUtility utility = new CarUtility();
        utility.carPrint(car);

    }
    // 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의.
//    public static void carPrint(CarDTO car) {
//        System.out.println(car.carSn + "\t" + car.carName + "\t" + car.carPrice + "\t" + car.carOwner + "\t" + car.carYear + "\t" + car.carType);
//    }
}
