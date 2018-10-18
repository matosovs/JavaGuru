package lv.javaguru.demo;

public class RandomNumberSum {
    public static void main(String[] args) {
        int firstRandomNumber = (int) ( Math.random() * 101 );
        int secondRandomNumber = (int) ( Math.random() * 101 );
        int thirdRandomNumber = (int) ( Math.random() * 101 );
        int sumResult = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);
        System.out.println("Sum result: "+ sumResult);
    }
}
