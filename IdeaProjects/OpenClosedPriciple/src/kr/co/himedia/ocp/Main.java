package kr.co.himedia.ocp;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("SmartWatchA", 42000, "New");
        Product product2 = new Product("SmartWatchB", 29000, "Old");
        Product product3 = new Product("SmartWatchC", 42000, "New");
        Product product4 = new Product("SmartWatchD", 29000, "New");

        System.out.println("product1 : " + product1);

        Validator dvalidator = new DefaultValidator();
        boolean result = dvalidator.support(product1);
        System.out.println("product1 새제품 여부 체크 : " + result);

        boolean result2 = dvalidator.support(product2);
        System.out.println("product2 새제품 여부 체크 : " + result2);

        System.out.println();

        dvalidator.validate(product3);

        try {
            dvalidator.validate(product4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
