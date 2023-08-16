package kr.co.himedia.srp;

public class ProductManager {

    public void update(Product product, int price) {

        validatePrice(price);

        product.updatePrice(price);
    }

    private void validatePrice(int price) {

        if (price < 30000) {
            throw new IllegalArgumentException("가격이 너무 낮습니다.");
        }
    }
}
