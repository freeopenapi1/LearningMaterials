package kr.co.himedia.srp2;

public class Product {

    private static final int MINIMUN_PRICE = 30000;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(int price) {
        validatePrice(price);
        this.price = price;
    }

    private void validatePrice(int price) {

        if (price < MINIMUN_PRICE) {
            throw new IllegalArgumentException(
                    String.format("최소가격은 %d원 이상입니다.", MINIMUN_PRICE));
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
