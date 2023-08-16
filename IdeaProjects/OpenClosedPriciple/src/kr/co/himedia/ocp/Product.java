package kr.co.himedia.ocp;

public class Product {

    private static final int MINIMUN_PRICE = 30000;
    private String name;
    private int price;

    // 새상품, 중고품.
    private String option;

    public Product(String name, int price, String option) {
        this.name = name;
        this.price = price;
        this.option = option;
    }

    public String getOption() {
        return option;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", option='" + option + '\'' +
                '}';
    }
}
