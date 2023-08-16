package kr.co.himedia.ocp;

public class DefaultValidator implements Validator {
    @Override
    public boolean support(Product product) {
        return product.getOption().equals("New");
    }

    @Override
    public void validate(Product product) throws IllegalArgumentException {

        if (product.getPrice() < 30000) {
            throw new IllegalArgumentException(product.getName()
                    + " :  가격 유효성 체크를 통과 못했습니다. 새 제품의 가격은 30000원 이상이어야 합니다.");
        }
        System.out.println(product.getName()
                + " : 새제품의 가격 유효성 체크를 통과 하였습니다.");
    }
}










