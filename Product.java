package lv.javaguru.demo;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice() {
        return regularPrice - regularPrice * discount;
    }

    public void print(){
        System.out.println("Product : " + "name = " + name + ", regular price = " + regularPrice + " EUR" + ", discount = " + discount + "%" + ", actual price = " + calculateActualPrice() + " EUR");
    }
}
