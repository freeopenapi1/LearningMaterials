package kr.co.himedia.srp;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("SmartWatchA", 42000);
        Product product2 = new Product("SmartWatchB", 30000);

        System.out.println("product1 : " + product1);

        ProductManager productManager = new ProductManager();
        productManager.update(product1, 39000);

        System.out.println("product1 : " + product1);

        try {
            productManager.update(product2, 28000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("product2 : " + product2);
    }
}
