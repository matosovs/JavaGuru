package lv.javaguru.demo;

public class CarTest {
    public static void main(String[] args) {
        Car newCar = new Car();

        newCar.setColour("red");
        newCar.setCarBrand("BMW");
        newCar.setCarAge(10);

        System.out.println("Car Colour is " + newCar.getColour());
        System.out.println("Car Brand is " + newCar.getCarBrand());
        System.out.println("Car Age is " + newCar.getCarAge());
    }
}
