package lv.javaguru.demo;

public class ProductTest {
    public static void main(String[] args) {
        Product newProduct = new Product();

        newProduct.setName("milk");
        newProduct.setRegularPrice(0.8);
        newProduct.setDiscount(0.2);
        newProduct.calculateActualPrice();
        newProduct.print();
    }
}
