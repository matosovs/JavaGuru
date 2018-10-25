package lv.javaguru.demo;

public class CircleTest {
    public static void main(String[] args){
        Circle simpleCirle = new Circle();
        simpleCirle.setRadius(10);
        simpleCirle.calculateArea();

        System.out.println("Radius is " + simpleCirle.getRadius());
        System.out.println("Circle square: " + simpleCirle.calculateArea());
    }
}
